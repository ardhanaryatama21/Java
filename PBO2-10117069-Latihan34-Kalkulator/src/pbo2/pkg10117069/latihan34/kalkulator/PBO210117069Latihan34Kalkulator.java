/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Kalkulator
     */
package pbo2.pkg10117069.latihan34.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PBO210117069Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : " + kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kal.kurangBiangan());
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        System.out.println("Hasil Pembagian : " + df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa : " + kal.sisaBilangan());
    }
    
}
