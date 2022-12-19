/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTH4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DiChuyenTrenDoThiCoTrongSO {
    
    static int a[][] = new int[302][302];
    static int n,m;
    
    static void floyd(){
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(a[i][j]>a[i][k]+a[k][j]){
                         a[i][j]=a[i][k]+a[k][j];
                         return;
                    }
                     if(a[i][j]<a[i][k]+a[k][j] && a[i][k]<20005 && a[k][j]<20005){
                        a[i][j]=Math.max(a[i][k], a[k][j]);
                    }
                       
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int q= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j) a[i][j]=0;
                else a[i][j]= (int)1e9;
            }
        }
        for(int i=1;i<=m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w =sc.nextInt();
            a[u][v]=w;
        }
        floyd();
        while(q-- >0){
            int u = sc.nextInt();
            int v= sc.nextInt();
            if(a[u][v]>25002)
                System.out.println("-1");
            else
                System.out.println(a[u][v]);
        }
        
    }
}
