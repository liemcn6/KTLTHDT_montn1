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
import java.math.BigInteger;

/**
 *
 * @author DELL
 */
public class SXMaTran {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        BufferedReader f = new BufferedReader(new FileReader("DATA.in"));
        String l = f.readLine();
        int t = Integer.parseInt(l);
        while(l != null){
            for(int i=0;i<t;i++){
                String[] split = f.readLine().trim().split("\\s+");
                String[] split1 = f.readLine().trim().split("\\s+");
                for(int j=0;j<split.length;j++){
                    
                }
                
            }
            String[] sp=l.trim().split("\\W+");
            for(int i=0;i<sp.length;i++){
                boolean numberInt = true;
                int numInt=0;
                try {
                    numInt = Integer.parseInt(sp[i]);
                } catch (Exception e) {
                    numberInt = false;
                }
                if(!numberInt){
                    boolean numerLong=true;
                    long numLong=0;
                    try {
                        numLong=Long.parseLong(sp[i]);
                    } catch (Exception e) {
                        numerLong=false;
                    }
                    if(numerLong){
                        
                    }
                }
            }
            l=f.readLine();
        }
        f.close();
    }
}
