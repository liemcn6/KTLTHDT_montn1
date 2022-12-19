/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.ThongKeTuKhacNhau;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        WordSet ws = new WordSet(input);
        System.out.println(ws);
    }
}
