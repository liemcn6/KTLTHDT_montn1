/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class LocEmailtrungnhau {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        TreeSet<String> e = new TreeSet<>();
        while(sc.hasNextLine()){
            e.add(sc.nextLine().toLowerCase().trim());
        }
        for(String x: e){
            System.out.println(x);
        }
    }
}
