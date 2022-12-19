/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class BienDoiTien_Hau {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            Stack<String> st = new Stack<>();
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='+' || s.charAt(i) == '-' ||
                        s.charAt(i) == '*' || s.charAt(i) == '/' || 
                        s.charAt(i) == '^' || s.charAt(i) == '%' ){
                    String s1= st.pop();
                    String s2= st.pop();
                    String tmp = s1+ s2 + s.charAt(i);
                    st.push(tmp);
                }
                else st.push(String.valueOf(s.charAt(i)));
            }
            System.out.println(st.peek());
        }
    }
}
