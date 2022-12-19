/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geaph_contest_12_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class duong_di_2 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Integer> [] ke = new ArrayList[1005];
    private static boolean [] check = new boolean[1005];
    private static int [] truoc = new int[1005];
    private static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int u = sc.nextInt();
            int v= sc.nextInt();
            int s = sc.nextInt();
            for(int i=0;i<=u;i++){
                ke[i] = new ArrayList<>();
                check[i] = false;
            }
            for(int i=0;i<v;i++){
                int a = sc.nextInt();
                int b= sc.nextInt();
                ke[a].add(b);
                ke[b].add(a);
            }
            q.add(s);
            check[s] = true;
            BFS(s);
            for(int i=1;i<=u;i++){
                if(i!=s){
                    Trace(s, i);
                }
            }
        }
    }
    private static void BFS (int start){
        int top = q.poll();
        for(int i : ke[top]){
            if(!check[i]){
                q.add(i);
                check[i]=true;
                truoc[i] = top;
            }
        }
        if(q.size() <= 0) return;
        else{
            BFS(top);
        }      
    }
    private static void Trace (int start,int finish){
        if(!check[finish]){
            System.out.println("No path");
            return;
        }
        ArrayList<Integer> res= new ArrayList<>();
        while(start != finish){
            res.add(finish);
            finish = truoc[finish];
        }
        res.add(start);
        Collections.reverse(res);
        for(int i:res){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    
}
