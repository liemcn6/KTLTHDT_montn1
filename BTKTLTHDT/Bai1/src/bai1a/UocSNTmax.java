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
public class UocSNTmax {
    static void solve(long n){
        for (int i = 2; i<= Math.sqrt(n) ; i++) {
            while(n % i == 0){
                n = n / i;
            }
        }
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            solve(n);
        }
    }
}
