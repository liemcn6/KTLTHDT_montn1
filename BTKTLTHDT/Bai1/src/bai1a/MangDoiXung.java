/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int kt=1;
        BigInteger b[]= new BigInteger[101];
        while(t-- >0){
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                b[i]=new BigInteger(sc.next());
            }
            for(int i=0;i<n/2;i++){
                if(b[i].equals(b[n-i-1])){
                    kt=1;
                }else kt=0;
            }
            if(kt==0)
                System.out.println("NO");
            else System.out.println("YES");
        }
        
    }
}
