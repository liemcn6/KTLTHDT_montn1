/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTh1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Maxminn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        while(true){
            int n = Integer.parseInt(sc.nextLine());
            long a[] = new long[n];
            long max= 0;
            long min = 9999999;
            for(int i=0;i<n;i++){
                a[i]=Long.parseLong(sc.nextLine());
                
                max=Math.max(max, a[i]);
               min=Math.min(max, a[i]);
            }
            if(n==0){
                System.out.println("");
            }
            else if(max==(min)){
                System.out.println("BANG NHAU");
            }else{
                System.out.println(min+" "+max);
            }
           
        }
    }
}
