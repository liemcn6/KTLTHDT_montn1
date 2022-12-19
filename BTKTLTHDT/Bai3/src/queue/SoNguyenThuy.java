/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class SoNguyenThuy {
    static int n;   
    static void solve(int n){
        Queue<Long> q = new PriorityQueue<>();
        q.add((long)4);
        q.add((long)5);
        Stack<Character> st = new Stack<>();
        while(n-->0){
            
            long a=q.poll();
             System.out.print(a);
            String word = a+"";
            for(int i = 0; i < word.length(); i++){
                st.push(word.charAt(i));
            }
            while(!st.empty()){
                System.out.print(st.peek());
                st.pop();
            }
            System.out.print(" ");
            
            q.add(a*10+4);
             q.add(a*10+5);     
        }
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            solve(n);
             System.out.println();

        }
    }
}
