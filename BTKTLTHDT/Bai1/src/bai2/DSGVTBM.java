/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DSGVTBM {
    private String ma,ten,boMon;

    public DSGVTBM(int ma, String ten, String boMon) {
        this.ma = "GV"+String.format("%02d",ma);
        this.ten = ten;
        this.boMon = boMon;
    }

    public String getBoMon() {
        return boMon;
    }

    public static String xuly(String boMon) {
        String tmp="";
        String[] split = boMon.trim().toUpperCase().split("\\W+");
        for(int i=0;i<split.length;i++)
            tmp+=String.valueOf(split[i].charAt(0));
        return tmp;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",ma,ten,xuly(boMon));
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<DSGVTBM> list=new ArrayList<>();
        for(int i=1;i<=t;i++){
            list.add(new DSGVTBM(i,sc.nextLine(),sc.nextLine()));
        }
        int q=Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String query=sc.nextLine().trim();
            System.out.format("DANH SACH GIANG VIEN BO MON %s:\n",DSGVTBM.xuly(query));
            for(DSGVTBM giangVien:list){
                if(query.equalsIgnoreCase(giangVien.getBoMon()))
                    System.out.println(giangVien);
            }
        }
    }
}
