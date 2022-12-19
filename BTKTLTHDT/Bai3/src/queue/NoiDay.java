/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NoiDay {
    static BigInteger mod = new BigInteger("1000000007");
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            PriorityQueue<BigInteger> pq = new PriorityQueue<>();
            for (long i = 0; i < n; i++) {
                String s = in.next();
                pq.add(new BigInteger(s));
            } 
            BigInteger sum = new BigInteger("0");
            while (pq.size() > 1) {
                BigInteger min1 = pq.poll(), min2 = pq.poll();
                BigInteger x = (min1.add(min2)).mod(mod);
                pq.add(x);
                sum = (sum.add(x)).mod(mod);
            }
            System.out.println(sum);
        }
    }
}
