/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[]= new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
            Collections.sort(list);
            String rs ="";
            rs=("Buoc " + i + ": ");
            for (int j = 0; j < list.size(); j++) {
                rs+=(list.get(j) + " ");
            }
            System.out.println(rs.trim());
        }
    }
}
