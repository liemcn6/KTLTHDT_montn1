/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LcmGcd {
    static  long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    static long lcm(long a, long b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = Integer.parseInt(sc.nextLine());
         while(t-- >0){
             long a = sc.nextLong();
             long b= sc.nextLong();
             System.out.print(lcm(a,b)+" ");
             System.out.println(gcd(a,b));
         }
    }
}
