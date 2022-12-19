/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class So0va9 {
    
    
     static long solve(int n){
        Queue<Long> q = new LinkedList<>();
        q.add((long)9);
        long a;
        while(q.size()>0){
            a=q.peek();
            if(a%n==0) return a;
            q.remove();
            q.add(a *10);
            q.add(a*10+9);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}
