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
public class DinhThat {
    private static boolean[] check = new boolean[105];
    private static ArrayList<Integer>[] ke = new ArrayList[105];
    private static ArrayList<Integer>[] res = new ArrayList[10000];
    private static int[] truoc = new int[105];
    private static int u,v,index;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            index=0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            u = sc.nextInt();
            v = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                ke[i] = new ArrayList<>();
                check[i] =false;
            }
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ke[a].add(b);
            }
            DFS(u,v);
            for(int i=1;i<index;i++){
                res[i].retainAll(res[i-1]);
            }
            System.out.println(res[index-1].size()-2);
        }
    }

    private static void DFS(int start, int finish) {
        check[start] = true;
        for (int i : ke[start]) {
            if (!check[i]) {
                check[i] = true;
                truoc[i] = start;
                if(i == finish) {
                    showWay(u, v);
                }
                else{
                    DFS(i, finish);
                }
                check[i] = false;
            }
        }
    }

    private static void showWay(int start, int finish) {
        ArrayList<Integer> tmpRes = new ArrayList<>();
        while(start!= finish){
            tmpRes.add(finish);
            finish = truoc[finish];
        }
        tmpRes.add(start);
        Collections.reverse(tmpRes);
        res[index] = tmpRes;
        index++;
    }

}
