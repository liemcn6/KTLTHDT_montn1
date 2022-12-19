/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTh1;


import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TachDoi {
    static  long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    static long lcm(long a, long b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- >0){
            String n = sc.next();
            if(n.length()%2!=0){
                System.out.println("INVALID");
            }else{
                //System.out.println(n.length());
                String a = n.substring(0, n.length()/2);
                String b = n.substring(n.length()/2);
                long a1 = Long.parseLong(a);
                long b1 = Long.parseLong(b);
                System.out.println(lcm(a1, b1));
            }
        }
    }
}
