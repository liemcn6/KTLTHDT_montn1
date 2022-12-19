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
public class XauConChungDaiNhat {

    public static void solve(String a, String b) {
        int n = a.length();  // n chiều dài xâu a, m chiều dài xâu b
        int m = b.length();

        String subsequence = "";  // Biến lưu con chung dùng khi truy vết
        int L[][] = new int[n + 1][m + 1];   // Khai báo mảng lưu kết quả:  n+1 hàng, m+1 cột

        for (int i = 0; i <= n; i++) // Gán cột đầu tiên bằng 0
        {
            L[i][0] = 0;
        }
        for (int j = 0; j <= m; j++) // Gán hàng đầu tiên = 0
        {
            L[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        int max_Size = L[n][m];  // Tìm được độ dài con lớn nhất
        
        while (L[n][m] != 0) { // Điều kiện dừng
            if (a.charAt(n - 1) == b.charAt(m - 1)) {  // Nếu bằng nhau
                subsequence += a.charAt(n - 1);   // Cộng a[i-1] vào xâu con
                n--;
                m--;
            } else {  // Nếu khác nhau
                if (L[n - 1][m] >= L[n][m - 1]) // So sánh
                {
                    n--;
                } else {
                    m--;
                }
            }
        }
        System.out.println(max_Size);
//        StringBuilder ss = new StringBuilder(subsequence);
//
//        // In ngược từ cuối về đầu để xâu con đúng thứ tự
//        System.out.println(ss.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            solve(s1, s2);
        }
    }
}
