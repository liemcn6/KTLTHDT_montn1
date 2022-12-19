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
public class Point {
    private double x,y;
    

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        p= this;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        return Math.sqrt((secondPoint.x - this.x)*(secondPoint.x - this.x)+(secondPoint.y - this.y)*(secondPoint.y - this.y));
    }
    public static double distance(Point p1,Point p2){
        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y - p1.y)*(p2.y - p1.y));
    }
    public static String formatKc(double kc){
        return String.format("%.04f", kc);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            Point p1;
            Point p2,p3;
            double x1= sc.nextDouble(),y1= sc.nextDouble();
            p1 = new Point(x1, y1);
            double x2= sc.nextDouble(),y2=sc.nextDouble();
            p2= new Point(x2, y2);
            double x3= sc.nextDouble(),y3=sc.nextDouble();
            p3= new Point(x3, y3);
            System.out.println(formatKc(distance(p1, p2)));
        }
    }
}
