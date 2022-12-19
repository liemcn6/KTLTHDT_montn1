/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BienDoiS_T {

    static int biendoi(int s, int t) {
        if (s >= t) {
            return s - t;
        }
        Queue<Integer> q = new LinkedList<>();
        int a[] = new int[20001];
        q.add(s);
        while (a[t] == 0) {
            int top = q.poll();
            if (top - 1 > 0 && a[top - 1] == 0) {
                a[top - 1] = a[top] + 1;
                q.add(top - 1);
            }
            if (top * 2 < 20000 && a[top * 2] == 0) {
                a[top * 2] = a[top] + 1;
                q.add(top * 2);
            }
        }
        return a[t];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt(), k = sc.nextInt();
            System.out.println(biendoi(s, k));
        }
    }
}
