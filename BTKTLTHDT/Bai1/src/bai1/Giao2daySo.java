/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class Giao2daySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n= sc.nextInt();
        m= sc.nextInt();
        
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        
        for(int i=0;i<n;i++){
            a.add( sc.nextInt());
        }
        for(int i=0;i<m;i++){
            b.add( sc.nextInt());
        }
        
        a.retainAll(b);
        for(Integer x: a){
            System.out.print(x+" ");
        }
    }
}
