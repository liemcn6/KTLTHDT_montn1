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
public class KLThongvoidinh1 {
    static void dfs(int u){
        check[u]= true;
        for(Integer x : ke[u]){
            if(!check[x])  dfs(x);
        }
    }
    static ArrayList<Integer> ke[] = new ArrayList[1002];
    static boolean check[] = new boolean[1002];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            check[1]= true;
            dfs(1);
            
            boolean test= false;
            for(int i =1;i<=n;i++){
                if(!check[i]){
                    System.out.println(i);
                    test=true;
                }
            }
            if(!test) System.out.println("0");
        }
}
