/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanModulLanjutan;

import static java.sql.DriverManager.println;
import java.util.Scanner;

/**
 *
 * @author Fareladzin Wibi
 */
public class FungsiPengembalianNilai {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Program Menjumlahkan 2 nilai");
        System.out.print("Masukan Niali A : ");
        a = masukan.nextInt();
        System.out.print("masukan nilai B : ");
        b = masukan.nextInt();
        System.out.print("Masukan nilai C : ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
    }
    private static int jumlah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
    }

