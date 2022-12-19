/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTh2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PointTG {
    private double x,y;
    

    public PointTG() {
    }

    public PointTG(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public PointTG(PointTG p){
        p= this;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(PointTG secondPoint){
        return Math.sqrt((secondPoint.x - this.x)*(secondPoint.x - this.x)+(secondPoint.y - this.y)*(secondPoint.y - this.y));
    }
    public static double distance(PointTG p1,PointTG p2){
        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y - p1.y)*(p2.y - p1.y));
    }
    public static String formatKc(double kc){
        return String.format("%.03f", kc);
    }
    public static  double dodai(PointTG p){
        return Math.sqrt(p.x*p.x+p.y*p.y);
    }
    
    
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            PointTG p1;
            PointTG p2,p3,p4,p5,p6;
            double x1= sc.nextDouble(),y1= sc.nextDouble();
            p1 = new PointTG(x1, y1);
            double x2= sc.nextDouble(),y2=sc.nextDouble();
            p2= new PointTG(x2, y2);
            double x3= sc.nextDouble(),y3=sc.nextDouble();
            p3= new PointTG(x3, y3);
            p4= new PointTG(x2-x1, y2-y1);
            p5 = new PointTG(x3-x1, y3-y1);
            p6= new PointTG(x3-x2, y3-y2);
            double chuvi = dodai(p4)+dodai(p5)+dodai(p6);
            Double a , b;
                    a =(p4.x / p5.x);
                    b=(p4.y/p5.y);
                if(a.isNaN() || b.isNaN() || a.equals(b)){
                    System.out.println("INVALID");
                    continue;
                }
                else{
                    
        
                        
                            System.out.println(formatKc(chuvi));
                 }
                
                
            
            
           
        }
    }
}
