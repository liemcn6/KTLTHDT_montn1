/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Prime {
    public static boolean isPrime(long n) {
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n]; 

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
           if(isPrime(a[i])==true){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }

        }
    }
}
