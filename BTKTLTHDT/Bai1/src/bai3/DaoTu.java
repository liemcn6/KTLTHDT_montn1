/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DaoTu {
    static String daoTu(String str){
        StringBuilder s = new StringBuilder(str);
        return new String(s.reverse());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            String[] arr = str.trim().split("\\s");
            String res = "";
            for(String x : arr){
                res += daoTu(x) + " ";
            }
            System.out.println(res.trim());
        }
    }
}
