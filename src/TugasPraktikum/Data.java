/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author Fareladzin Wibi
 */
public class Data {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        String nama, tempat,jk,alamat,motto,tanggal;
        int NIS;
        System.out.print("Nama : ");
        nama = inputan.next();
        System.out.print("NIS : ");
        NIS= inputan.nextInt();
        System.out.print("Tempat Lahir : ");
        tempat = inputan.next();
        System.out.print("Tanggal Lahir : ");
        tanggal = inputan.next();
        System.out.print("Jenis Kelamin : ");
        jk = inputan.next();
        System.out.print("Alamat di Malang : ");
        alamat = inputan.next();
        System.out.print("Motto Hidup : ");
        motto = inputan.next();
        System.out.println("========================= ");
        
        System.out.println("Nama Anda : "+nama);
        System.out.println("NIS Anda : "+NIS);
        System.out.println("Tempat Lahir Anda : "+tempat);
        System.out.println("Tanggal Lahir Anda : "+tanggal);
        System.out.println("Jenis Kelamin Anda : "+jk);
        System.out.println("Alamat Anda : "+alamat);
        System.out.println("Motto Hidup Anda Anda : "+motto);
        
        
    }
}
