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
public class TinhGTBTHauTo {
    
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String str = sc.nextLine();
            Stack<Long> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '^' || str.charAt(i) == '%') {
                    long a = stack.pop();
                    long b = stack.pop();
                    long temp = 0;
                   switch(str.charAt(i)) {
                        case '+': temp = b+a; break;
                        case '-': temp = b-a; break;
                        case '*': temp = b*a; break;
                        case '/': temp = b/a; break;
                        case '^': temp = (int)Math.pow(b, a); break;
                        case '%': temp = b%a; break;
                        
                }
                    stack.push(temp);
                }
                else{
                   stack.push(new Long(Character.getNumericValue(str.charAt(i))));
                }
            }
            System.out.println(stack.peek());
        }
    }
}
