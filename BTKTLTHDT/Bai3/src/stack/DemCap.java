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
public class DemCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n + 2];
        int[] kq = new int[n + 2];
        Stack<Integer> st = new Stack<>();
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            kq[i] = -1;
        }
        if (n == 2) {
            System.out.println(1);
            return;
        }
        long d = 0;
        for (int i=0; i < n; i++) {
//                       System.out.print(st+" ");      
 
            while (!st.isEmpty() && a[st.peek()] < a[i]) {
                    kq[st.peek()] = a[i];
                st.pop();
                d++;
            }
            d+=(long) st.size();
            st.push(i);
 
        }
 
        System.out.println(d);
    }
 }

