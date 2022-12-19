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
public class TinhTongSoLong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        BufferedReader f = new BufferedReader(new FileReader("DATA.in"));
        String l = f.readLine();
        BigInteger sum = new BigInteger("0");
        while(l != null){
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
                        sum=sum.add(new BigInteger(sp[i]));
                    }
                }
            }
            l=f.readLine();
        }
        System.out.println(sum);
        f.close();
    }
    
}
