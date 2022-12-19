/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class KBNhanVien {
    private String mnv="",ht="",gt="",ns="",dc="",mst="",nk="";
    
    Scanner sc = new Scanner(System.in);
    public KBNhanVien() {
    }
     public void nhap(){
        mnv="00001";
        ht= sc.nextLine();
        gt= sc.nextLine();
        ns= sc.nextLine();
        dc= sc.nextLine();
        mst=sc.nextLine();
        nk=sc.nextLine();
        
        
    }
    public String formatNS(String ns) throws ParseException{
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date d= sd.parse(ns);
        String kq = sd.format(d);
        return kq;
    }
   
    public void xuat() throws ParseException{
        System.out.println(mnv+" "+ht+" "+gt+" "+formatNS(ns)+" "+dc+" "+mst+" "+formatNS(nk));
    }
    
    public static void main(String[] args) throws ParseException {
       KBNhanVien k = new KBNhanVien();
        k.nhap();
        k.xuat();
    }
}
