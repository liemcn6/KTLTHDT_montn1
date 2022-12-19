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
public class DauNgoac {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String a = sc.nextLine();
            Stack<Integer> stack = new Stack<>();
            int dem=1;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)== '('){
                    stack.push(dem);
                    System.out.print(dem+" ");
                    dem++;
                }else if( a.charAt(i)==')'){
                    System.out.print(stack.peek()+" ");
                    
                    
                    stack.pop();
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
