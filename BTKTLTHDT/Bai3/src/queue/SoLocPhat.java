/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoLocPhat {
    static int n;
    static boolean checkLength(long num){
        int c =0;
        while(num>0){
            c++;
            num/=10;
        }
        if(c>n){
            return false;
        }
        return true;
    }
    static void solve(int n){
        Queue<Long> q = new PriorityQueue<>();
        q.add((long)6);
        q.add((long)8);
       
        List<Long> l = new ArrayList<>();
        
        while(checkLength(q.peek())){
            
            long a=q.poll();
           
            q.add(a*10+6);
             q.add(a*10+8);
             
             l.add(a);
             
        }
        while(q.isEmpty()){
          
            l.add(q.poll());
        }
        System.out.println(l.size());
        for(int j = l.size()-1;j>=0;j--){
            System.out.print(l.get(j)+" ");
        }
        System.out.println();
        
        
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            solve(n);
        }
    }
}
