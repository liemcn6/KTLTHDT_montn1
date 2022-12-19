/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.*;

/**
 *
 * @author DELL
 */
public class DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream o=new  FileInputStream("DATA.in");
        int t;
        while((t = o.read()) != -1){
            System.out.print((char)t);
        }
        o.close();
    }
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        BufferedReader f = new BufferedReader(new FileReader("DATA.txt"));
//        String l = f.readLine();
//        while(l != null) {
//            System.out.println(l);
//            l = f.readLine();
//        }
//        f.close();
//    }
}
