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
public class TongGiaiThua {
    
    static long solve(int n){
        long t=1;
        long sum=0;
        for(int i=1;i<=n;i++ ){
            t*=i;
            sum+=t;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solve(n));
    }
}
