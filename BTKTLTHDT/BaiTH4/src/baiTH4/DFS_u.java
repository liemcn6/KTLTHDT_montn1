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
public class DFS_u {
    static void dfs(int u){
        System.out.print(u+" ");
        check[u]= true;
        for(Integer x : ke[u]){
            if(!check[x])  dfs(x);
        }
    }
    static ArrayList<Integer> ke[] = new ArrayList[1002];
    static boolean check[] = new boolean[1002];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(),b= sc.nextInt();
            int s = sc.nextInt();
            for(int i=0;i<=a;i++){
                ke[i]= new ArrayList<>();
                check[i]= false;
            }
            for(int i=1;i<=b;i++){
                int u = sc.nextInt(),v=sc.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            System.out.print("DFS("+s+") = ");
            dfs(s);
            System.out.println();
        }
    }
}
