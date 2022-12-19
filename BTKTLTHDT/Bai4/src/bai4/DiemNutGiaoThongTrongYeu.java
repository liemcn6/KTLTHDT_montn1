/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DiemNutGiaoThongTrongYeu {
    static List<Integer>[] ke = (List<Integer>[]) new List[1005];
    static boolean[] check = new boolean[1005];
    static int[] before = new int[1005];

    static void DFS(int u) {
        check[u] = true;
        for (int i = 0; i < ke[u].size(); i++) {
            int v = ke[u].get(i);
            if (!check[v]) {
                before[v] = u;
                DFS(v);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < ke.length; i++) {
                ke[i] = new ArrayList<>();
                check[i]=false;
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i < b; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            int res = 0;
            for (int i = 1; i <= a; i++) {
                if (check[i] == false) {
                    res++;
                    DFS(i);
                }
            }
            int dem=0;
            String s="";
            for (int i = 1; i <= a; i++) {
                for (int j = 0; j < 1005; j++) {
                    check[j] = false;
                }
                check[i] = true;
                int count = 0;
                for (int j = 1; j <= a; j++) {
                    if(check[j] == false){
                        count++;
                        DFS(j);
                    }
                }
                if(count > res){
                    dem++;
                    //System.out.print(i + " ");
                    s+=i+" ";
                }
            }
            System.out.println(dem);
            System.out.println(s);
        }
    }
}
