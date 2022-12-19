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
public class TinhTong {
    
        public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader f = new BufferedReader(new FileReader("DATA.txt"));
        String l = f.readLine();
            List<String> list = new ArrayList<>();
        long sum =0;
        while(l != null) {
            String[] split = l.trim().split("\\W+");
            for(int i=0;i<split.length;i++){
                boolean numeric = true; 
                long  num=0;
                try{
                     num = Integer.parseInt(split[i]);
                }  
                catch (NumberFormatException e){
                     numeric = false;
                }
                if(numeric){
                    sum+=(num);
                }else {
                    list.add(split[i]);
                }
            }
            l = f.readLine();
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(sum);
        for(String x: list){
            System.out.print(x+" ");
        }
        f.close();
    }
        
    
}
