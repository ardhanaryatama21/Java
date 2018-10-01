/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Ganti Kata
 */
package pbo2.pkg10117069.latihan28.gantikata;

import java.util.Scanner;

public class PBO210117069Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----Program Ganti Kata----");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scan.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scan.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scan.next();
        kalimatBaru = (kalimatAwal).replaceAll(gantiKata, jadiKata);
        System.out.println(" ");
        System.out.println("----Hasil Formatting----");
        System.out.println("Kalimat Awal : " + kalimatAwal);
        System.out.println("Kalimat Baru : " + kalimatBaru);
    }
    
}
