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
public class LienThong_cacDinhkcungLTvoiDinhX {
     private static int[] check = new int[305];
    private static ArrayList<Integer>[] ke = new ArrayList[305];

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            ke[i] = new ArrayList<>();
            check[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ke[a].add(b);
            ke[b].add(a);
        }
        check[x] =1;
        DFS(x);
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            if (check[i]==0) {
                System.out.println(i);
                flag = true;
            }
        }
        if(!flag) System.out.println("0");
    }
    private static void DFS(int start){
        for(int i: ke[start]){
            if(check[i]==0){
                check[i]=1;
                DFS(i);
            }
        }
    }
}
