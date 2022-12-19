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
public class SoFibo {
   public static int fibo(int n){
        int cnt = 2;
        int a0 = 1, a1 = 1, a2 = 2;
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            while(cnt++ < n){
                a2 = a0 + a1;
                a0 = a1;
                a1 = a2;
            }
            return a2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if(n<=92){
                            System.out.println(fibo(n));

            }
        }
    }
}
