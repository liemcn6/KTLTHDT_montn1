/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DSthiICPC {
    
    private Team t;
    private ThiSinh ts;

    public DSthiICPC(Team t, ThiSinh ts) {
        this.t = t;
        this.ts = ts;
    }

    public DSthiICPC() {
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soteam= Integer.parseInt(sc.nextLine());
        List<Team> listT = new ArrayList<>();
        List<ThiSinh> listTS = new ArrayList<>();
        List<DSthiICPC> list = new ArrayList<>();
        for(int i=0;i<soteam;i++){
            String tenTeam = sc.nextLine();
            String tenTruong = sc.nextLine();
            listT.add(new Team(i+1, tenTeam, tenTruong));
        }
        int soTS= Integer.parseInt(sc.nextLine());
        for(int i=0;i<soTS;i++){
            String tenTS = sc.nextLine();
            String maT = sc.nextLine();
            listTS.add(new ThiSinh(i+1, tenTS, maT));
        }
        for(Team t:listT){
            for(ThiSinh ts: listTS){
                if(t.ma.equals(ts.maTeam)){
                    list.add(new DSthiICPC(t, ts));
                }
            }
        }
        list.sort(new Comparator<DSthiICPC>() {
            @Override
            public int compare(DSthiICPC o1, DSthiICPC o2) {
                return o1.ts.ten.compareTo(o2.ts.ten);
            }
        });
        
        for(DSthiICPC x: list){
            System.out.println(x.ts.ma+" "+x.ts.ten+" "+x.t.tenTeam+" "+x.t.tenTruong);
        }
        
    }
    
    public static class Team{
        private String ma,tenTeam,tenTruong;

        public Team(int ma,String tenTeam, String tenTruong) {
            this.ma ="Team"+String.format("%02d", ma);
            this.tenTeam = tenTeam;
            this.tenTruong = tenTruong;
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getTenTeam() {
            return tenTeam;
        }

        public void setTenTeam(String tenTeam) {
            this.tenTeam = tenTeam;
        }

        public String getTenTruong() {
            return tenTruong;
        }

        public void setTenTruong(String tenTruong) {
            this.tenTruong = tenTruong;
        }
        
    }
    public static class ThiSinh{
        private String ma,ten;
        private String maTeam;

        public ThiSinh() {
        }

        public ThiSinh(int ma, String ten, String maTeam) {
            this.ma = "C"+String.format("%03d", ma);
            this.ten = ten;
            this.maTeam = maTeam;
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getMaTeam() {
            return maTeam;
        }

        public void setMaTeam(String maTeam) {
            this.maTeam = maTeam;
        }
        
    }
}
