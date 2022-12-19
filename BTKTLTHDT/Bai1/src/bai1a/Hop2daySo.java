/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class Hop2daySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n= sc.nextInt();
        m= sc.nextInt();
        
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        TreeSet<Integer> a1 = new TreeSet<>();
        for(int i=0;i<n;i++){
            int s= sc.nextInt();
            a.add( s);
            a1.add(s);
        }
        for(int i=0;i<m;i++){
            int s= sc.nextInt();
            b.add( s);
        }
        
        a.retainAll(b);
        for(Integer x: a){
            a1.remove(x);
        }
        a1.addAll(b);
        for(Integer x : a1){
            System.out.print(x+" ");
        }
    }
}
