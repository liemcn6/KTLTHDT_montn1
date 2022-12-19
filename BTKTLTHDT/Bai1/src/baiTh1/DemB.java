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
public class DemB {
     static int solve(int n, int k, String l) {
         if(n==0) return 0;
        if (n == 1) return 1;
        int g = l.length();
        int count = 0;
        for(int i=0;i<k;i++){
            
            if(l.charAt(i)=='B') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] arr = new String[1000];
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            arr[0] = "A";
            arr[1] = "B";
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            String l="";
            for(int i=0;i<k;i++){
                l+=arr[i];
            }
            
            System.out.println(solve(n, k, l));
        }
    }
}
