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
public class BienDoiHAu_Tien {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            Stack<String> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='+' || s.charAt(i) == '-' ||
                        s.charAt(i) == '*' || s.charAt(i) == '/' || 
                        s.charAt(i) == '^' || s.charAt(i) == '%' ){
                    String s1= st.pop();
                    String s2= st.pop();
                    String tmp = s.charAt(i)+s2+ s1;
                    st.push(tmp);
                }
                else st.push(String.valueOf(s.charAt(i)));
            }
            System.out.println(st.peek());
        }
    }
}
