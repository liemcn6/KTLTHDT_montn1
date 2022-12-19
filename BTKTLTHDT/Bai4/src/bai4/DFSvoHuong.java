/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DFSvoHuong {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
     public static String dfs(int u){
         String ss="";
         ss+= u + " -> ";
        //System.out.print(u + " ");
        chuaxet[u] = false;
        for(Integer v : dske[u]){
            if(chuaxet[v]) ss+=dfs(v);
        }
        return ss;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            n = in.nextInt(); m = in.nextInt();
            int s = in.nextInt();
            String kq="DFS("+s+") = ";
            for(int i=0;i<=n;i++){
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for(int i=1;i<=m;i++){
                int u = in.nextInt(), v = in.nextInt();
                dske[u].add(v); dske[v].add(u);
            }
            //dfs(s);
            kq+=dfs(s);
            System.out.print(kq.substring(0, kq.length()-4));
            System.out.println();

        }
    }
}
