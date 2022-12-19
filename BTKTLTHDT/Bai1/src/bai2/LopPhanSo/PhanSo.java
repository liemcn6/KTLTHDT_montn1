/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.LopPhanSo;


/**
 *
 * @author DELL
 */
public class PhanSo {
    private long tu,mau;
    
   
    public  PhanSo(){
        
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo(String a){
 
        String[] split = a.trim().split("\\W+");
        this.tu = Long.parseLong(split[0]);
        this.mau = Long.parseLong(split[1]);
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
     public long UCLN(long a,long b)
    {
        if ((a==0) || (b==0))
            return a+b;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void ToiGian() 
    {
        long i=UCLN(tu, mau);
        this.tu = this.tu/(i);
        this.mau = this.mau/(i);
    }
    
    public PhanSo cong(PhanSo ps) {
        long ts = this.getTu() * ps.getMau()  + ps.getTu() * this.getMau();
        long ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.ToiGian();
        return new PhanSo(phanSoTong.tu, phanSoTong.mau);
    }
      
     
    public PhanSo nhan(PhanSo ps) {
        long ts = this.getTu() * ps.getTu();
        long ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.ToiGian();
        return new PhanSo(phanSoTich.tu, phanSoTich.mau);
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
    
}
