/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTH4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DothiLienThong {
    
    static ArrayList<Integer> ke[] = new ArrayList[1002];
    static boolean check[] = new boolean[1002];
    static int truoc[]= new int[1002];
    
    static void dfs(int u){
        check[u]= true;
        for(Integer x : ke[u]){
            if(!check[x])  {
                dfs(x);
                truoc[x]=u;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(),m= sc.nextInt();
            
            for(int i=0;i<=n;i++){
                ke[i]= new ArrayList<>();
                check[i]= false;
            }
            for(int i=1;i<=m;i++){
                int u = sc.nextInt(),v=sc.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            int dem=0;
            for(int i=1;i<=n;i++){
                if(!check[i]){
                    dem++;
                    dfs(i);
                }
            }
            int sodinh=0;
            String s="";
            for(int i=1;i<=n;i++){
                for(int j=0;j<1002;j++){
                    check[j]=false;
                }
                check[i]= true;
                int count=0;
                for(int j=1;j<=n;j++){
                    if(!check[j]){
                        count++;
                        dfs(j);
                    }
                }
                
                if(count>dem){
                    sodinh++;
                    s+=i+" ";
                }
            }
            
            System.out.println(sodinh);
            System.out.println(s);
        }
    }
}
