/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geaph_contest_12_10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class di_chuyen_tren_bang_so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] array = new int[n + 5][m + 5];
            int[][] tmpArray = new int[n + 5][m + 5];
            for (int i = 0; i < n + 5; i++) {
                Arrays.fill(tmpArray[i], 0);
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= m; j++) {
//                    if (i == 1 && j == 1) {
//                        tmpArray[i][j] = array[i][j];
//                    } else if (i == 1) {
//                        tmpArray[i][j] = array[i][j] + tmpArray[i][j - 1];
//                    } else if (j == 1) {
//                        tmpArray[i][j] = array[i][j] + tmpArray[i - 1][j];
//                    } else {
//                        tmpArray[i][j] = array[i][j] + Math.min(tmpArray[i - 1][j - 1], Math.min(tmpArray[i - 1][j], tmpArray[i][j - 1]));
//                
//                    }
//                }
//            }
            System.out.println(tmpArray[n][m]);
        }
    }

}
