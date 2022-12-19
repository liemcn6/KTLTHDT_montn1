/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KBSinhVien {
    private String msv="",ht="",lop="",ns="";
    private float diem=0;
    Scanner sc = new Scanner(System.in);
    public KBSinhVien() {
    }
     public void nhap(){
        msv="B20DCCN001";
        ht= sc.nextLine();
        lop= sc.nextLine();
        ns= sc.nextLine();
        diem = sc.nextFloat();
        
    }
    public String formatNS(String ns) throws ParseException{
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date d= sd.parse(ns);
        String kq = sd.format(d);
        return kq;
    }
    public String formatDiem(float diem){
        return String.format("%.02f", diem);
    }
    public void xuat() throws ParseException{
        System.out.println(msv+" "+ht+" "+lop+" "+formatNS(ns)+" "+formatDiem(diem));
    }
    
    public static void main(String[] args) throws ParseException {
        KBSinhVien k = new KBSinhVien();
        k.nhap();
        k.xuat();
    }
}
