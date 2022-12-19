/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KhaiBaoThiSinhClass {
    
    private String ht,ns;
    private float d1,d2,d3;
    Scanner sc = new Scanner(System.in);
    public KhaiBaoThiSinhClass() {
    }
   
    public void nhap(){
        ht= sc.nextLine();
        ns= sc.nextLine();
        d1= sc.nextFloat();
        d2= sc.nextFloat();
        d3= sc.nextFloat();
    }
    public void xuat(){
        System.out.println(ht+" "+ns+" "+Float.sum(d1, Float.sum(d2, d3)));
    }
    
    public static void main(String[] args) {
        KhaiBaoThiSinhClass k = new KhaiBaoThiSinhClass();
        k.nhap();
        k.xuat();
    }
    
}


