/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan27_huruf;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Mempelihatkan hasil formatting terhadap string
 */
public class PBO2_10117081_Latihan27_Huruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String kalimat;
       
       Scanner baca = new Scanner(System.in);
       
        System.out.print("Masukkan Kalimat : ");
        kalimat = baca.nextLine();
        
        System.out.println("==== Hasil Formatting ====");
        System.out.println("Huruf Besar\t : " + kalimat.toUpperCase());
        System.out.println("Huruf Besar\t : " + kalimat.toLowerCase());
        
        
    }
    
}
