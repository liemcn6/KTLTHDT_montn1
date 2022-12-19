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
public class GcdSoNguyenLon {
   
    public static void main(String[] args) {
        BigInteger num1,num2;
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
        String a= sc.nextLine();
        String b = sc.nextLine();
        num1 = new BigInteger(a);
        num2 = new BigInteger(b);
        System.out.println(num1.gcd(num2));
        }
        
    }
}
