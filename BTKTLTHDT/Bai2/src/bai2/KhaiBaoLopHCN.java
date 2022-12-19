/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class KhaiBaoLopHCN {
    private double width,height;
    private String color;

    public KhaiBaoLopHCN() {
       this.width=1;
        this.height=1;
    }

    public KhaiBaoLopHCN(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return height*width;
    }
    public  double findPerimeter(){
        return (height+width)*2;
    }
    
    static String chuanHoa(String ten){
        StringBuilder res = new StringBuilder();
        StringTokenizer s = new StringTokenizer(ten);
        while (s.hasMoreElements()) {
           String ss= s.nextToken();
           res.append(Character.toUpperCase(ss.charAt(0)));
           for(int i=1;i<ss.length();i++){
               res.append(Character.toLowerCase(ss.charAt(i)));
           }
           res.append(" ");
            
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        DecimalFormat de = new DecimalFormat();
        Scanner sc = new Scanner(System.in);
        double dai= Integer.parseInt(sc.next());
        double rong = Integer.parseInt(sc.next());
        String mau = sc.next();
        KhaiBaoLopHCN k = new KhaiBaoLopHCN(dai, rong, mau);
        if(k.height > 0 && k.width >0){
            System.out.println(de.format(k.findPerimeter())+" "+de.format(k.findArea())+" "+chuanHoa(k.getColor()));
        }else{
            System.out.println("INVALID");
        }
    }
}
