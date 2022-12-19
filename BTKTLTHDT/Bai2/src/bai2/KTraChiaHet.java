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
public class KTraChiaHet {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
             BufferedReader f = new BufferedReader(new FileReader("SONGUYEN.IN"));
        String l = f.readLine();
        int t = Integer.parseInt(l);
        String kq="";
        while(l != null){
            for(int i=0;i<t;i++){
                BigInteger n = new BigInteger(f.readLine());
                BigInteger a = new BigInteger("0");
                //long n =Long.parseLong(f.readLine());
                //if(n%7 ==0 && n%13 ==0) kq="Both";
                if(n.mod(new BigInteger("7")).equals(a) && n.mod(new BigInteger("13")).equals(a))
                    kq="Both";
                else if(n.mod(new BigInteger("7")).equals(a)) kq="Div 7";
                else if( n.mod(new BigInteger("13")).equals(a)) kq="Div 13";
                else kq="None";
                System.out.println(kq.trim());
            }
           
        }
        
        f.close();
        } catch (Exception e) {
        }

    }
}
