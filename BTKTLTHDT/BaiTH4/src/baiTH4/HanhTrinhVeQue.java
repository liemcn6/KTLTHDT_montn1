/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTH4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class HanhTrinhVeQue {
    static ArrayList<Integer> ke[] = new ArrayList[22];
    static boolean check[] = new boolean[22];
    static int truoc[] = new int[22];
    static TreeSet<String> k= new TreeSet<>();
    static TreeSet<String> m = new TreeSet<>();
    static TreeSet<String> k1 = new TreeSet<>();
    
    static void dfs(int s){
       check[s]= true;
       for(Integer x : ke[s]){
            if(!check[x]){
                dfs(x);
                truoc[x]=s;
            }
        }
    }
    
    static String truyVet(int s, int e){
        String ss="";
        ArrayList<Integer> kq= new ArrayList<>();
        while(e != s){
            kq.add(e);
            e=truoc[e];
        }
        kq.add(s);
        Collections.reverse(kq);
        for(Integer i : kq){
            ss+=i+" ";
        }
        return ss;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(),b= sc.nextInt();
            
            for(int i=0;i<=a;i++){
                ke[i]= new ArrayList<>();
                check[i]= false;
            }
            for(int i=1;i<=b;i++){
                int u = sc.nextInt(),v=sc.nextInt();
                ke[u].add(v);
              
            }
            dfs(1);
            String sp1[]=truyVet(1, 2).split("\\s");
            for(int i=0;i<sp1.length;i++){
                k.add(sp1[i]);
                k1.add(sp1[i]);
            }

             for(int i=0;i<=a;i++){
                check[i]= false;
            }
            dfs(2);
            String sp2[]=truyVet(2, 1).split("\\s");
            for(int i=0;i<sp2.length;i++){
                m.add(sp2[i]);
            }
            k.retainAll(m);
            for(String x: k){
                k1.remove(x);
            }
            k1.addAll(m);
            System.out.println(k1.size());
        }
    }
}
