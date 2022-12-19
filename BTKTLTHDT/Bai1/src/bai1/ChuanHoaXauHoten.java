/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class ChuanHoaXauHoten {
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
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while(n-->=0){
            String hoten = sc.nextLine();
            System.out.println(chuanHoa(hoten));
        }
    }
}
