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
public class ChuanHoaXauTenHo {
    static String chuanHoa(String ten,int cach){
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
      
        String tmp[] = res.toString().trim().split("\\s++");
        String kq="";
        if(cach==1){
          kq = tmp[tmp.length - 1];
          for(int i=0;i<tmp.length -1;i++){
            kq+=" "+tmp[i];
            }  
        }else{
           for(int i=1;i<tmp.length;i++){
               kq+=tmp[i]+" ";
           }
           kq+=tmp[0];
        }
       
        return kq.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        while(n-- >0){
            int cach = Integer.parseInt(sc.nextLine());
            String hoten = sc.nextLine();
            System.out.println(chuanHoa(hoten,cach));
        }
    }
}
