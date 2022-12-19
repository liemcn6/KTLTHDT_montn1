/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CaiTui {
    
    static int solve(int a[], int c[],int n, int v){
        int k[][] = new int[n+1][v+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=v;j++){
                if(i==0 ||j ==0) k[i][j]=0;
                else if(j< a[i]) k[i][j]=k[i-1][j];
                else k[i][j]= Math.max(k[i-1][j], c[i]+k[i-1][j-a[i]]);
            }
        }
        return k[n][v];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n= sc.nextInt();
            int v= sc.nextInt();
            int a[] = new int[1005];
            int c[] = new int[1005];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                c[i]=sc.nextInt();
            }
            System.out.println(solve(a,c,n,v));
        }
    }
}
