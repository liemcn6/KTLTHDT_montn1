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
public class DemTPLienThong_tu1denNkhiBoChinhno {
    static List<Integer>[] ke = (List<Integer>[]) new List[20005];
    static int[] check = new int[20005];

    static void DFS(int u) {
        check[u] = 1;
        for(int i: ke[u]){
            if(check[i]==0){
                //check[i]=1;
                DFS(i);
            }
        }
    }
    static int TPLT(int n, int locate) {
        int dem = 0;
        check[locate] = 1;
         
            for (int i = 1; i <= n; i++) {
                if (check[i]==0) {
                    dem++;
                    DFS(i);
                }
            }
        
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < ke.length; i++) {
                ke[i] = new ArrayList<>();
                check[i] = 0;
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i < b; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            for (int i = 1; i <= a; i++) {
                for(int j=0;j<=a;j++){
                    check[j]=0;
                }
                System.out.println(TPLT(a,i));
            }
        }

}
