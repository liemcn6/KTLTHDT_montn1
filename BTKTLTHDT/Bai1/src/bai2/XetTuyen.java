/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class XetTuyen {
    private String ma,ten,loai;
    private int tuoi;
    private  double dtb;

    public XetTuyen(int ma, String ten, String loai, int tuoi, double dtb) {
        this.ma = "PH"+String.format("%02d",ma);
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
        this.dtb = dtb;
    }
    
    static String chuanHoa(String ten){
        StringBuilder res = new StringBuilder();
        StringTokenizer s = new StringTokenizer(ten);
        while (s.hasMoreTokens()) {
               String ss = s.nextToken();
               res.append(Character.toUpperCase(ss.charAt(0)));
               for(int i=1;i<ss.length();i++){
                   res.append(Character.toLowerCase(ss.charAt(i)));
               }
               res.append(" ");
        }
        return res.toString().trim();
    }
    
    
    public static void main(String[] args) {
        DecimalFormat decimalFormat=new DecimalFormat("#.#");
        try{
            BufferedReader f = new BufferedReader(new FileReader("XETTUYEN.in"));
            String l = f.readLine();
            int t = Integer.parseInt(l);
            List<XetTuyen> list = new ArrayList<>();
           
            
            
     while(l != null) {
                String ten,date;
            for(int i=1;i<=t;i++){
                
                ten=chuanHoa(f.readLine());
                date = f.readLine();
                String[] split = date.split("/");
                int ns = Integer.parseInt(split[split.length-1]);
                int tuoi = 2021-ns;
                double diemthuong=0;
               
                double lt,th,cong;
                lt=Double.parseDouble(f.readLine());
                th=Double.parseDouble(f.readLine());
                if(lt >=8 && th >=8){
                    diemthuong=1;
                }else if(lt < 7.5 || th < 7.5){
                    diemthuong=0;
                }else {
                    diemthuong=0.5;
                }
            double tongDiem= Math.round((lt+th)/2+diemthuong);
            if(tongDiem>10) tongDiem=10;
            
           // double tongDiem=Math.round((toan+ly+hoa)*10.0)/10.0+cong;
           String loai="";
           if(tongDiem<5) loai="Truot";
           else if(tongDiem==5 || tongDiem==6) loai="Trung binh";
           else if(tongDiem == 7) loai="Kha";
           else if(tongDiem ==8) loai="Gioi";
           else loai="Xuat sac";
           
            list.add(new XetTuyen(i,ten,loai,tuoi,tongDiem));
            
         }
           
           
         
        for(XetTuyen x: list){
            System.out.println(x.ma+" "+x.ten+" "+x.tuoi+" "+decimalFormat.format(x.dtb)+" "+x.loai);
        }
         
        }
         
         
         
     
        f.close();
        }catch(Exception e){
            
        }
  
    }
    
    
}
