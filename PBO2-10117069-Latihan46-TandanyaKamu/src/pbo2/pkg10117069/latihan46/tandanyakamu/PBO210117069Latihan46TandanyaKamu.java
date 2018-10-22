/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Tandanya Kamu
 */
package pbo2.pkg10117069.latihan46.tandanyakamu;

import java.util.Scanner;

public class PBO210117069Latihan46TandanyaKamu {

    public static void main(String[] args) {
        // TODO code application logic here
        Age ag = new Age(2018);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        ag.setYearBirth(sc.nextInt());
        System.out.println("\n===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : " + ag.getYearBirth());
        System.out.println("Hari ini tahun : " + ag.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + ag.hitungUmur() + " Tahun");
        ag.tandanyaKamu(ag.hitungUmur());
    }
    
}
