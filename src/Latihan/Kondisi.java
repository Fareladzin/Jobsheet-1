/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Fareladzin Wibi
 */
public class Kondisi {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print("masukan Nilai Akhir PBO :");
        nilai = masukan.nextInt();
        if(nilai < 75)
            System.out.println("Anda Remidi");
        if(nilai >= 75)
            System.out.println("Anda Kompeten");
    }
}
