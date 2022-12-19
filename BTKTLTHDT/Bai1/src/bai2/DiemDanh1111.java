/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DiemDanh1111 {
    private String ma,ten,lop,ghiChu="";
    private int diem;

    public DiemDanh1111(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        diem=10;
    }

    public String getMa() {
        return ma;
    }

    public void setDiemDanh(String a) {
        for(int i=0;i<a.length();i++){
            if(diem>0){
                if(a.charAt(i)=='v') diem-=2;
                else if(a.charAt(i)=='m') diem-=1;
            }
            else{
                diem=0;
                break;
            }
        }
        if(diem==0) ghiChu="KDDK";
    }

    @Override
    public String toString() {
        String format = String.format("%s %s %s %d", ma, ten, lop, diem);
        if(ghiChu.equals("")|| ghiChu.isEmpty()){
            return format.trim();
        }
        return (format+" "+ghiChu).trim();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<DiemDanh1111> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            list.add(new DiemDanh1111(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i=0;i<t;i++){
            String[] split = sc.nextLine().trim().split("\\s+");
            String maSinhVien=split[0];
            String diemDanh=split[1];
            for(DiemDanh1111 sinhVien:list)
                if(sinhVien.getMa().equals(maSinhVien)){
                    sinhVien.setDiemDanh(diemDanh);
                    break;
                }
        }
        for(DiemDanh1111 sinhVien:list)
            System.out.println(sinhVien);
    }
}
