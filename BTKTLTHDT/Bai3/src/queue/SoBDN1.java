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
public class SoBDN1 {
    
    static void solve(String n){
        int count =0;
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(!q.isEmpty()){
            String s =q.poll();
            if(s.length() < n.length()){
                count++;
                q.add(s + "0");
                q.add(s + "1");
            }
            if(n.length() == s.length() && s.compareTo(n) <= 0) count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String n = sc.nextLine();
            solve(n);
        }
    }
}
