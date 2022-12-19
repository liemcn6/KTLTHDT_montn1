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
public class SoNHiPhanTu1denN {
    
    
    static void solve(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 + " ");
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            solve(n);
            System.out.println();
        }
    }
}
