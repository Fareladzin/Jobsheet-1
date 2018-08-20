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
public class LuasBola {
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        double jari ;
        System.out.print("Nilai Panjang Jari - Jari = ");
        jari = masukan.nextInt();
        System.out.println("==============================");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("==============================");
        System.out.println("Luas Permukaan Bola = "+ (4* 3.14 *jari * jari) );
    }
}
