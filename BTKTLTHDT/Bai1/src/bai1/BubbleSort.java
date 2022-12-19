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
public class BubbleSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
           list.add(arr[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < n; i++) {
            boolean check = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] != list.get(j)) {
                    check = true;
                    break;
                }
            }

            if (!check) break;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
            String res=("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                res+=(arr[j] + " ");
            }
            System.out.println(res.trim());
        }
    }
}
