/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DUongDiBFScoHuongSE {
    private static boolean[] check = new boolean[1005];
    private static int[] truoc = new int[1005];
    private static ArrayList<Integer>[] ke = new ArrayList[1005];
    private static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int s = sc.nextInt();
            int f = sc.nextInt();
            for (int i = 0; i <= u; i++) {
                ke[i] = new ArrayList<>();
                check[i] = false;
            }
            for (int i = 0; i < v; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ke[a].add(b);
            }
            q.add(s);
            check[s] = true;
            BFS(s,f);
            Trace(s, f);
        }
    }

    private static void BFS(int start, int finish) {
        int top = q.poll();
        if(top ==finish) return;
        for (int i = 0; i < ke[top].size(); i++) {
            if (!check[ke[top].get(i)]) {
                q.add(ke[top].get(i));
                check[ke[top].get(i)] = true;
                truoc[ke[top].get(i)] = top;
            }
        }
        if(q.size() == 0) return;
        else{
            BFS(top,finish);
        }
    }
    private static void Trace(int start, int finish) {
        if(!check[finish]) {
            System.out.println("-1");
            return;
        }
        ArrayList<Integer> res= new ArrayList<>();
        while(finish !=start){
            res.add(finish);
            finish = truoc[finish];
        }
        res.add(start);
        Collections.reverse(res);
        String s="";
        for(int i:res){
            s+=i+" -> ";
        }
         System.out.print(s.substring(0, s.length()-4));
        System.out.println("");
    }
}
