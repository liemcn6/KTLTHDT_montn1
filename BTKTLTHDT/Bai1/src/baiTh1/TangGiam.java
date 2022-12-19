/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTh1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class TangGiam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            int n = sc.nextInt();
            TreeSet<Integer> a = new TreeSet<>();
            TreeSet<Integer> b = new TreeSet<>();
            
            SortedSet<Integer> d = new TreeSet<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for(int i=0;i<n;i++){
                a.add(sc.nextInt()); 
            }
            for(Integer x:a){
                if(x%2==0){
                    b.add(x);
                }else{
                    d.add(x);
                }
            }
            for(Integer x: b){
                System.out.print(x+" ");
            }
            System.out.print("\n");
            for(Integer x: d){
                System.out.print(x+" ");
            }
            System.out.print("\n");
        }
    }
}
