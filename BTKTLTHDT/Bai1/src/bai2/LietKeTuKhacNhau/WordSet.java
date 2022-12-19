/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.LietKeTuKhacNhau;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class WordSet {
    private String file="";

    public WordSet(String f) {
        this.file = f;
    }

    
    
    public String xuli(String fil) throws IOException {
        BufferedReader f;
         String kq="";
        try {
            f = new BufferedReader(new FileReader(fil));
            String l= f.readLine();
       
        SortedSet<String> t = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        while(l != null) {
            String[] split = l.trim().toLowerCase().split("\\W+");
            for(int i=0;i<split.length;i++){
                t.add(split[i]);
            }
            l = f.readLine();
        }
        for(String x: t){
            kq+=x+"\n";
             }
         f.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordSet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
        return kq;
    }

    @Override
    public String toString() {
        try {
            return xuli(file).trim();
        } catch (IOException ex) {
            Logger.getLogger(WordSet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return" ";
    }
    
}
