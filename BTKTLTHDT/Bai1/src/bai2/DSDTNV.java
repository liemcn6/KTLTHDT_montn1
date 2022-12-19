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
public class DSDTNV {
    private String maNhanVien,ten,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKiHopDong;

    public DSDTNV(int maNhanVien, String ten, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong) {
        this.maNhanVien = String.format("%05d",maNhanVien);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }
    public String toString(){
        return String.format("%s %s %s %s %s %s %s",maNhanVien,ten,gioiTinh,
                ngaySinh,diaChi,maSoThue,ngayKiHopDong);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            DSDTNV nhanVien=new DSDTNV(i, sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.println(nhanVien);
        }
    }
}
