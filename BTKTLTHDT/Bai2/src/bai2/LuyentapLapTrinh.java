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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author DELL
 */
public class LuyentapLapTrinh {
    private String ten;
    private long baiDung,tongSubmit;

    public LuyentapLapTrinh(String ten, long baiDung, long tongSubmit) {
        this.ten = ten;
        this.baiDung = baiDung;
        this.tongSubmit = tongSubmit;
    }

    public LuyentapLapTrinh() {
    }
    
    
     public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
             BufferedReader f = new BufferedReader(new FileReader("LUYENTAP.in"));
        String l = f.readLine();
           
        int t = Integer.parseInt(l);
          List<LuyentapLapTrinh> list = new ArrayList<>();
        while(l != null){
            for(int i=0;i<t;i++){
                String ten = f.readLine();
               
                String[] sp=f.readLine().trim().split("\\s+");
                long baiDung = Long.parseLong(sp[0]);
                long tongSubmit = Long.parseLong(sp[1]);
                
                list.add(new LuyentapLapTrinh(ten, baiDung, tongSubmit));
                
            }
            
            list.sort(new Comparator<LuyentapLapTrinh>() {
                @Override
                public int compare(LuyentapLapTrinh o1, LuyentapLapTrinh o2) {
                    if(o2.baiDung > o1.baiDung){
                        return o2.baiDung - o1.baiDung > 0 ? 1 : -1;
                    }else if(o2.baiDung == o1.baiDung && o2.tongSubmit != o1.tongSubmit){
                        return (o1.tongSubmit - o2.tongSubmit)> 0 ? 1 : -1 ;
                    }else {
                        return o1.ten.compareTo(o2.ten);
                    }
                }
            });
            
            for(LuyentapLapTrinh x: list){
                System.out.println(x.ten+" "+x.baiDung+" "+x.tongSubmit);
            }
           
        }
        
        f.close();
        } catch (Exception e) {
        }

    }
}
