/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;




/**
 *
 * @author DELL
 */
public class DSMatHang {
    private static int crMa = 1;
    private int maMHint;
    private String maMH,tenMH,dvTinh;
    private long giaMua,giaBan,loiNhuan;
    
     static Scanner sc=new Scanner(System.in);
    
    public DSMatHang() {
        this.maMHint = crMa++;
    }
    
    public void nhap(){
        maMH = formatMa(maMHint);
        tenMH = sc.nextLine();
        dvTinh = sc.nextLine();
        giaMua = Long.parseLong(sc.nextLine());
        giaBan = Long.parseLong(sc.nextLine());
        loiNhuan = giaBan - giaMua;
    }
    public String formatMa(int ma){
        String kq = "MH0";
        if(ma<=9){
            kq+="0"+ma;
        }else kq+=ma;
        return kq;
    }
    
    
    
    public static void main(String[] args) {
        
        int m = Integer.parseInt(sc.nextLine());
        List<DSMatHang> list = new ArrayList();
        while(m-- > 0){
            DSMatHang ds = new DSMatHang();
            ds.nhap();
            list.add(ds);
        }
        list.sort(new Comparator<DSMatHang>() {
            @Override
            public int compare(DSMatHang o1, DSMatHang o2) {
                if(o1.loiNhuan - o2.loiNhuan <=0){
                    return 1;
                }else return -1;
               }
        });
        for(DSMatHang e : list){
            System.out.println(e.maMH+" "+e.tenMH+" "+e.dvTinh+" "+e.giaMua+" "+e.giaBan+" "+e.loiNhuan);
            
        }
        
       
    }
}
