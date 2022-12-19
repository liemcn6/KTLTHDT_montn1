/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.DiemDanh1;

/**
 *
 * @author DELL
 */
public class SinhVien {
    private String ma,ten,lop,ghiChu="";
    private int diem;

    public SinhVien(String ma, String ten, String lop) {
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
            return format;
        }
        return format+" "+ghiChu;
    }
}
