/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class XauConDoiXungLonggest {
    
    static int solve(String s){
        int res= 1;
        for(int i=0;i<s.length();i++){
            int u=i,v=i;
            while(u>=0 && v<s.length()){
                if(s.charAt(u)== s.charAt(v)){
                    res = Math.max(res, v-u +1);
                    u--;v++;
                }else break;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            int u=i,v=i+1;
            while(u>=0 && v<s.length()){
                if(s.charAt(u)== s.charAt(v)){
                    res = Math.max(res, v-u +1);
                    u--;v++;
                }else break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-- > 0){
            String ss = sc.nextLine();
            System.out.println(solve(ss));
            
        }
    }
}
