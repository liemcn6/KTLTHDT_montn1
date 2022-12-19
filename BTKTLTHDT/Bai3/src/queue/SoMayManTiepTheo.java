/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class SoMayManTiepTheo {

    static int n = 100;

    static void solve(int a, int b) {
        Queue<Long> q = new PriorityQueue<>();
        q.add((long) 4);
        q.add((long) 7);
        Stack<Character> st = new Stack<>();
        List<Long> l = new ArrayList<>();
        List<Long> l1 = new ArrayList<>();
        while (n-- > 0) {

            long aa = q.poll();

            q.add(aa * 10 + 4);
            q.add(aa * 10 + 7);

            l.add(aa);

        }

        while (q.isEmpty()) {

            l.add(q.poll());
        }

        long sum = 0;

        for (int i = a; i <= b; i++) {
            for (int j = 0; j < l.size(); j++) {
                if (i <= l.get(j)) {
                    l1.add(l.get(j));
                    break;
                }
                continue;
            }
        }

        for (long i : l1) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        solve(a, b);
        System.out.println();

    }
}
