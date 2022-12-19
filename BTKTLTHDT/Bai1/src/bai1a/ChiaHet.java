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
public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        BigInteger s = new BigInteger("0");
        while(t-- >0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if(a.mod(b).equals(s) || b.mod(a).equals(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
