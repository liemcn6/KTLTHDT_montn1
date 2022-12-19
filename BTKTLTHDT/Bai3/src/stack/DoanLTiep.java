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
public class DoanLTiep {
    static void solve(int[] a, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] kq = new int[n + 1];
        kq[0] = 1;
        for (int i=n-1;i>=0;i--){
            while (!stack.isEmpty() && a[stack.peek()] < a[i])
                kq[stack.peek()] = stack.pop() - i;
            stack.push(i);
        }
        while (!stack.isEmpty())
            kq[stack.peek()]=stack.pop()+1;
        for (int i=0;i<n;i++)
            System.out.print(kq[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n+1];
            for(int i=0;i<n;i++){
                 a[i] = sc.nextInt();
                 
            }
            solve(a,n);
            
        }
    }
}
