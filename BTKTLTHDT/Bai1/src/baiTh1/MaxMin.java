/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTh1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger arr,max,min;
        while(true){
            int n = Integer.parseInt(sc.nextLine());
            String a[] = new String[n];
            max= new BigInteger("0");
            min = new BigInteger("9999999999999999999999999999999999");
            for(int i=0;i<n;i++){
                a[i]=sc.nextLine();
                arr= new BigInteger(a[i]);
                max=max.max(arr);
                min=min.min(arr);
            }
            if(n==0){
                System.out.println(" ");
            }
            else if(max.equals(min)){
                System.out.println("BANG NHAU");
            }else{
                System.out.println(min+" "+max);
            }
           
        }
    }
}
