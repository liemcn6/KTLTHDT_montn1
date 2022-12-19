/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geaph_contest_12_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class thanh_phan_lien_thong_1 {

    /**
     * @param args the command line arguments
     */
    private static boolean[] check = new boolean[305];
    private static ArrayList<Integer>[] ke = new ArrayList[305];

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int v = sc.nextInt();
        int s = sc.nextInt();
        for (int i = 0; i <= u; i++) {
            ke[i] = new ArrayList<>();
            check[i] = false;
        }
        for (int i = 0; i < v; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ke[a].add(b);
            ke[b].add(a);
        }
        check[s] = true;
        DFS(s);
        boolean flag = false;
        for (int i = 1; i <= u; i++) {
            if (!check[i]) {
                System.out.println(i);
                flag = true;
            }
        }
        if(!flag) System.out.println("0");
    }
    private static void DFS(int start){
        for(int i: ke[start]){
            if(!check[i]){
                check[i]=true;
                DFS(i);
            }
        }
    }

}
