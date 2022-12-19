/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class PhanTuBenPhai {
    
  
    static void xuly(int a[],int n){
        int R[] = new int[n], i, j;
        int K[] = new int[n];
        for (i = 0; i < n; i++) {
                R[i] = -1;
                K[i] = -1;
            }
       //a[]   //5 1 9 2 5 1 7
        Stack<Integer> st = new Stack<>();
        for (i = 0; i < n; i++) {
                while (!st.isEmpty() && a[st.peek()] < a[i]) {
                    R[st.peek()] = i;
                    st.pop();
                }
                st.push(i);
            }
        //R[]  //9 9 -1 5 7 7 7 ben phai lon hon dau tien 
        st.clear();
        //Stack<Integer> st1 = new Stack<>();
         for (i = 0; i < n; i++) {
                while (!st.isEmpty() && a[st.peek()] > a[i]) {
                    K[st.peek()] = a[i];
                    st.pop();
                }
                st.push(i);
            }
        
        
        
        for ( i = 0; i < n; i++) {
                if (R[i] != -1) {
                    System.out.print(K[R[i]] + " ");
                } else {
                    System.out.print(R[i] + " ");
                }
            }
            System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), a[] = new int[n];
            for(int i=0;i<n;i++) a[i] = in.nextInt();
            xuly(a,n);
        }
    }

}
