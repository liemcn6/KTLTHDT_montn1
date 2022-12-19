/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream sc =new FileInputStream("DATA.txt");
        DataInputStream d = new DataInputStream(sc);
        
        
        int t;
        List<Integer> list = new ArrayList<>();
       
        String s="";
        while((t = d.read()) != -1){
            int kk = d.readInt();
            list.add(kk);
        }
       
        int a[]=new int[100001];
        for(Integer i:list){
                a[i]++;
        }
        for(int i=0;i<list.size();i++){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
        sc.close();
    }
}
