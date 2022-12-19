/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class BaiTH3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            String[] s= str.split("\\s+");
            
            Stack<Long> st = new Stack<>();
            for(int i=0;i<s.length;i++){
              if(s[i].equals("+")||s[i].equals("-")
                      ||s[i].equals("*")||s[i].equals("/")
                      ||s[i].equals("^")||s[i].equals("%")){
                  long a= st.pop();
                  long b = st.pop();
                  long tmp=0;
                  switch(s[i]){
                      case "+": tmp = b+a; break;
                      case "-": tmp = b-a; break;
                      case "*": tmp = b*a; break;
                      case "/": tmp = b/a; break;
                      case "^": tmp = (long) Math.pow(b, a); break;
                      case "%": tmp = b%a; break;
                  }
                  st.push(tmp);
              }else{
                  st.push(Long.parseLong(s[i]));
              }
            }
            System.out.println(st.peek());
        }
    }
    
}
