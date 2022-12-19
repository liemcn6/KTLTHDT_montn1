/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geaph_contest_12_10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class thanh_phan_lien_thong_2 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Integer>[] ke = new ArrayList[20005];
    private static boolean[] check = new boolean[20005];

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
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
            System.out.println(TPLT(n,i));
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
