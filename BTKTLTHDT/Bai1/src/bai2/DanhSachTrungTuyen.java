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
public class DanhSachTrungTuyen {
    private String ma,ten;
    private double toan,ly,hoa,cong,tongXt;

    public DanhSachTrungTuyen(String ma, String ten, double toan, double ly, double hoa,double cong,double tongXt) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.cong=cong;
        this.tongXt= tongXt;
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
            BufferedReader f = new BufferedReader(new FileReader("THISINH.in"));
            String l = f.readLine();
            int t = Integer.parseInt(l);
            List<DanhSachTrungTuyen> list = new ArrayList<>();
            List<DanhSachTrungTuyen> list1 = new ArrayList<>();
            int chitieu=0;
            
     while(l != null) {
                String ma,ten,khuVuc;
            for(int i=1;i<=t;i++){
                ma=f.readLine();
                ten=chuanHoa(f.readLine());
                khuVuc=ma.substring(0,3);
               
                double toan,ly,hoa,cong;
                switch (khuVuc){
                case "KV1": cong=0.5;break;
                case "KV2": cong=1.0;break;
                default: cong=2.5;break;
                                }
                
            toan=Double.parseDouble(f.readLine())*2.0;
            ly=Double.parseDouble(f.readLine());
            hoa=Double.parseDouble(f.readLine());
            double tongDiemxetTuyen=Math.round((toan+ly+hoa)*10.0)/10.0+cong;
            list.add(new DanhSachTrungTuyen(ma, ten, toan, ly, hoa,cong, tongDiemxetTuyen));
            
         }
           chitieu = Integer.parseInt(f.readLine());
           list.sort(new Comparator<DanhSachTrungTuyen>() {
                    @Override
                    public int compare(DanhSachTrungTuyen o1, DanhSachTrungTuyen o2) {
                       if(o1.tongXt == o2.tongXt){
                           return o1.ma.compareTo(o2.ma);
                       }else{
                         return  o2.tongXt - o1.tongXt> 0 ? 1 : -1;
                       }
                    }
         });
           
           for(int i=0; i<chitieu;i++){
             list1.add(list.get(i));
         }
           double diemchuan=list1.get(list1.size()-1).tongXt;
         String trangThai="";
         
         System.out.format("%.1f\n",diemchuan);
         
         for(DanhSachTrungTuyen x: list){
             
             if(x.tongXt>=diemchuan) trangThai="TRUNG TUYEN";
             else trangThai="TRUOT";
             System.out.println(x.ma+" "+x.ten+" "+decimalFormat.format(x.cong)+" "+decimalFormat.format(x.tongXt)+" "+trangThai);
         }
         
        }
         
         
         
     
        f.close();
        }catch(Exception e){
            
        }
  
    }
}
