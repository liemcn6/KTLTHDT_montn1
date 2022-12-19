/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PhanSo {
    private BigInteger tu,mau;
     Scanner sc = new Scanner(System.in);
    public  PhanSo(){
        
    }
   
    public void ToiGian() 
    {
        BigInteger i=tu.gcd(mau);
        this.tu = this.tu.divide(i);
        this.mau = this.mau.divide(i);
    }
    public void nhap(){
        this.tu = new BigInteger(sc.next());
        this.mau= new BigInteger(sc.next());
    }
    public void xuat(){
        System.out.println(this.tu+"/"+this.mau);
    }
    
    public static void main(String[] args) {
       PhanSo p = new PhanSo();
       p.nhap();
       p.ToiGian();
       p.xuat(); 
    }
}
