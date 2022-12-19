/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith3;


import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class XauNhiPhanDXChan {
    static int n;
    
    static String convert(String a){
        String s="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='4') s+='0';
            else if(a.charAt(i)=='5') s+='1';
            else s+=' ';
        }
        return s;
    }
    static void solve(int n){
        Queue<BigInteger> q = new PriorityQueue<>();
        q.add(new BigInteger("4"));
        q.add(new BigInteger("5"));
        String kq="";
        Stack<Character> st = new Stack<>();
        while((q.peek()).toString().length()*2<=n){
            BigInteger a = q.poll();
            kq+=a;
            String w = a+"";
            for(int i=0;i<w.length();i++){
                st.push(w.charAt(i));
            }
            while(!st.empty()){
               // convert(st.peek());
                //System.out.print(convert(st.peek()));
                kq+=st.peek();
                st.pop();
            }
            //System.out.print(" ");
            kq+=" ";
            q.add(a.multiply(new BigInteger("10")).add(new BigInteger("4")));
            q.add(a.multiply(new BigInteger("10")).add(new BigInteger("5")));
        }
        System.out.print(convert(kq.trim()));
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            n= sc.nextInt();
            solve(n);
            System.out.println();
        }
    }
}
