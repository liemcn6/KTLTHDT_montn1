/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ChuanHoamailPTIT {
    static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s1 = sc.nextLine();
        while(N-- > 0){
            String str = sc.nextLine();
            if(str.equals("")) return;
            String[] s = str.trim().toLowerCase().split("\\s++");
            String res = "";
            res += s[s.length - 1];
            for (int i = 0; i < s.length - 1; i++) {
                res += s[i].charAt(0);
            }
            if(map.get(res) == null){
                System.out.println(res + "@ptit.edu.vn");
                map.put(res, 1);
            }else{
                System.out.println(res + (map.get(res) + 1) + "@ptit.edu.vn");
                map.put(res, map.get(res) + 1);
            }
        }
    }
}
