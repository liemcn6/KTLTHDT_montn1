/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class DSSVtFile2 {
    private String maSv;
    private String ten;
    private String lop;
    private Date ngaySinh;
    private Float diem;

    public DSSVtFile2(int maSv, String ten, String lop, String ngaySinh, Float diem) throws ParseException {
        this.maSv = "B20DCCN"+String.format("%03d",maSv);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diem = diem;
    }
    public String toString(){
        return String.format("%s %s %s %s %.2f",maSv,ten,lop,new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh),diem);
    }
    
    public static void main(String[] args) throws FileNotFoundException,NullPointerException, IOException, ParseException {
        
        try{
            BufferedReader f = new BufferedReader(new FileReader("SV.in"));
            String l = f.readLine();
            int t = Integer.parseInt(l);
             while(l != null) {
            for(int i=1;i<=t;i++){
                String ten=f.readLine();
                String lop= f.readLine();
                String ngaySinh= f.readLine();
                Float diem= Float.parseFloat(f.readLine());
                
                DSSVtFile2 sv = new DSSVtFile2(i, ten, lop, ngaySinh, diem);
                System.out.println(sv);
                
             }
           
        }
        f.close();
        }catch(Exception e){
            
        }
        
       
    }

}
