/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Fareladzin Wibi
 */
public class KonversiSuhu {
    public static void main(String[]args){
        double c = 78;
        double r, f, k;
        r = 4 * c /5 ;
        f = 9 * c /5 +32;
        k = c + 273;
        System.out.println("Konversi Suhu Celcius : 78 derajat");
        System.out.println("Dalam Reamur :"+ r);
        System.out.println("Dalam Farenheit :"+ f);
        System.out.println("Dalam Kelvin :"+ k);
    }
    
    
}
