/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTH4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DuongdiBFSvohuongS {
    static ArrayList<Integer> ke[] = new ArrayList[1002];
    static boolean check[] = new boolean[1002];
    static int truoc[] = new int[1002];
    static  Queue<Integer> q = new LinkedList<>();
    
    static void bfs(int s){
        int top = q.poll();
        for(Integer i : ke[top]){
            if(!check[i]){
                q.add(i);
                check[i]= true;
                truoc[i]=top;
            }
        }
        if(q.size()==0) return;
        else bfs(top);
    }
    
    static void truyVet(int s, int e){
        if(!check[e]){
            System.out.println("No path"); return;
        }
        ArrayList<Integer> kq= new ArrayList<>();
        while(e != s){
            kq.add(e);
            e=truoc[e];
        }
        kq.add(s);
        Collections.reverse(kq);
        for(Integer i : kq){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(),b= sc.nextInt();
            int s = sc.nextInt();
            for(int i=0;i<=a;i++){
                ke[i]= new ArrayList<>();
                check[i]= false;
            }
            for(int i=1;i<=b;i++){
                int u = sc.nextInt(),v=sc.nextInt();
                ke[u].add(v);
                ke[v].add(u);
            }
            q.add(s);
            check[s]= true;
            bfs(s);
            
            for(int i=1;i<=a;i++){
                if(s != i){
                    truyVet(s, i);
                }
            }
        }
    }
}
