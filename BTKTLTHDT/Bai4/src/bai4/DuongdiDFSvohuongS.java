/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DuongdiDFSvohuongS {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int truoc[] = new int[1001];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            n = in.nextInt(); m = in.nextInt();
            int s = in.nextInt();// t = in.nextInt();
            for(int i=0;i<=n;i++){
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
                truoc[i] = 0;
            }
            for(int i=1;i<=m;i++){
                int u = in.nextInt(), v = in.nextInt();
                dske[u].add(v); dske[v].add(u);
            }
            dfs(s);
            for(int i=1;i<=n;i++){
                if(s != i) Trace(s, i);
            }
        }
    }
    public static void dfs(int u){
        chuaxet[u] = false;
        for(Integer v : dske[u]){
            if(chuaxet[v]) {
                dfs(v);
                truoc[v] = u;
            }
        }
    }
     private static void Trace(int start, int finish) {
        if(chuaxet[finish]) {
            System.out.println("No path");
            return;
        }
        ArrayList<Integer> res= new ArrayList<>();
        while(finish !=start){
            res.add(finish);
            finish = truoc[finish];
        }
        res.add(start);
        Collections.reverse(res);
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
