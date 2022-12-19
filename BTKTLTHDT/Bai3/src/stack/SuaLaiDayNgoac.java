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
public class SuaLaiDayNgoac {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            Stack<Character> st = new Stack<>();
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)==')' && st.size()==0){
                    st.push(s.charAt(i));
                }else if(s.charAt(i)==')'){
                    if(st.size()>0 && st.peek()=='(') st.pop();
                    else st.push(s.charAt(i));
                }
            }
            int x=0,y=0;
            while(st.size()>0){
                if(st.peek()=='(') x++;
                else y++;
                st.pop();
            }
            System.out.println(x/2 +y/2 +x%2 +y%2);
        }
    }
}
