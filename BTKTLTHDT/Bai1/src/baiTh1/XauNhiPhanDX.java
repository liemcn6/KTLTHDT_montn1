/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTh1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class XauNhiPhanDX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        str = '-'+str;
        
        int t = sc.nextInt();
        while(t-- > 0){
            int s = sc.nextInt();
            int e = sc.nextInt();
            boolean ck= true;
            
            for(int i=0;i<=(e-s)/2;i++){
                if(str.charAt(s+i) != str.charAt(e-i)){
                    ck=false;
                }
            }
            if(ck==true){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
