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
public class ChiaCatDoThi {
     private static ArrayList<Integer>[] ke = new ArrayList[105];
    private static boolean[] check = new boolean[105];

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> tmpRes =  new ArrayList<>();
            ArrayList<Integer> res =  new ArrayList<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                ke[i] = new ArrayList<>();
                check[i] = false;
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ke[a].add(b);
                ke[b].add(a);
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    check[j] = false;
                }
                int tRes=TPLT(n,i);
                tmpRes.add(tRes);
                res.add(tRes);
            }
            Collections.sort(tmpRes);
            int max = tmpRes.get(n-1);
            if(max == 1){
                System.out.println("0");
            }
            else{
                for(int i=0;i<n;i++){
                    if(res.get(i) == max){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
    }

    private static void DFS(int s) {
        check[s] = true;
        for (int i : ke[s]) {
            if (!check[i]) {
                check[i] = true;
                DFS(i);
            }
        }
    }

    private static int TPLT(int n, int locate) {
        int dem = 0;
        check[locate] = true;
        if (locate == 1) {
            for (int i = 2; i <= n; i++) {
                if (!check[i]) {
                    dem++;
                    DFS(i);
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                    dem++;
                    DFS(i);
                }
            }
        }
        return dem;
    }
}
