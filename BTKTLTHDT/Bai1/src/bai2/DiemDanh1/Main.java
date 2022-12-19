/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.DiemDanh1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
//         sc=new Scanner(new File("C:\\Users\\Admin\\Desktop\\SPOJ\\src\\input.txt"));
        int t=Integer.parseInt(sc.nextLine());
        List<SinhVien> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(int i=0;i<t;i++){
//            String maSinhVien=sc.next();
//            String diemDanh=sc.next();
            String[] split = sc.nextLine().trim().split("\\W+");
            String maSinhVien=split[0];
            String diemDanh=split[1];
            for(SinhVien sinhVien:list)
                if(sinhVien.getMa().equals(maSinhVien)){
                    sinhVien.setDiemDanh(diemDanh);
                    break;
                }
        }
        for(SinhVien sinhVien:list)
            System.out.println(sinhVien);
    }
}
