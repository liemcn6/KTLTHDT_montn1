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
public class ChiaHetSoNguyenLon {
    public static void main(String[] args) {
        BigInteger num1,num2,tmp;
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
        String a= sc.next();
        String b = sc.next();
        num1 = new BigInteger(a);
        num2 = new BigInteger(b);
        tmp=new BigInteger("0");
        if((num1.mod(num2).equals(tmp)) || (num2.mod(num1).equals(tmp))){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }
    }
}
