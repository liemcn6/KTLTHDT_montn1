/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoFiboThuN {
    static int e = 1000000007;

    static void mul(long[][] f, long[][] m) {
        long x = ((f[0][0] % e * m[0][0] % e) % e + (f[0][1] % e * m[1][0] % e) % e) % e;
        long y = ((f[0][0] % e * m[0][1] % e) % e + (f[0][1] % e * m[1][1] % e) % e) % e;
        long z = ((f[1][0] % e * m[0][0] % e) % e + (f[1][1] % e * m[1][0] % e) % e) % e;
        long t = ((f[1][0] % e * m[0][1] % e) % e + (f[1][1] % e * m[1][1] % e) % e) % e;
        f[0][0] = x;
        f[0][1] = y;
        f[1][0] = z;
        f[1][1] = t;
    }

    static void solve(long[][] f, int n) {
        if (n == 0 || n == 1) return;
        long[][] m = new long[][]{{0, 1}, {1, 1}};
        solve(f, n / 2);
        mul(f, f);
        if (n % 2 != 0) mul(f, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long[][] f = new long[][]{{0, 1}, {1, 1}};
            int n = sc.nextInt();
            solve(f, n - 1);
            System.out.println(f[1][1]);
        }
    }
}
