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
public class SelectSort {
        public static void swap(int a[], int i, int j){
        int tmp;
        tmp = a[i] ;
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j = i+1; j<n;j++){
                if(a[min] > a[j]){
                    min=j;
                }
            }
            swap(a,i,min);

            String kq ="Buoc "+ (i+1) + ": ";
            for(int k=0;k<n;k++){
                kq += String.valueOf( a[k])+' ';
            }
            System.out.println(kq.trim());
        }
        
        
    }
    
}
