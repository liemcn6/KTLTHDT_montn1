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
public class DSDTSV2 {
    private String maSv;
    private String ten;
    private String lop;
    private Date ngaySinh;
    private Float diem;
    
    public DSDTSV2(int maSv, String ten, String lop, String ngaySinh, Float diem) throws ParseException {
        this.maSv = "B20DCCN"+String.format("%03d",maSv);
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diem = diem;
    }

    private String chuanHoa(String ten) {
        String tmp="";
        String[] split = ten.trim().toLowerCase().split("\\W+");
        char[] chars = split[0].toCharArray();
        chars[0]-=32;
        tmp+=new String(chars);
        for(int i=1;i<split.length;i++){
            chars = split[i].toCharArray();
            chars[0]-=32;
            tmp+=" "+new String(chars);
        }
        return tmp;
    }

    public String toString(){
        return String.format("%s %s %s %s %.2f",maSv,ten,lop,new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh),diem);
    }
    
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            DSDTSV2 sinhVien=new DSDTSV2(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
            System.out.println(sinhVien);
        }
    }
    
}
