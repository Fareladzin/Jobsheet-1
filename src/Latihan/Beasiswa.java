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
public class Beasiswa {
    public static void main (String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Nilai TPA :");
        int TPA = masukan.nextInt();
        System.out.print("Masukan nilai bahasa inggris : ");
        int bahasainggris = masukan .nextInt();
        if((TPA>85) && (bahasainggris >80))
            System.out.println("Siswa dapat Beasiswa");
        else
            System.out.println("Siswa tidak dapat beasiswa");
    }
}
