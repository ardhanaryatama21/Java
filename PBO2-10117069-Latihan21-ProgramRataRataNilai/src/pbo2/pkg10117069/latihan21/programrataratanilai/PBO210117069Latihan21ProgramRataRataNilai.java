/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan program Rata-Rata Nilai
 */
package pbo2.pkg10117069.latihan21.programrataratanilai;

import java.util.Scanner;

public class PBO210117069Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int banyak;
        int nilai;
        int ke = 0;
        int totalNilai = 0;
        double rata = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyak = scan.nextInt();
        do {
        ke = ke + 1;
        System.out.print("Nilai Mahasiswa ke-" + ke + " : ");
        nilai = scan.nextInt();
        totalNilai = totalNilai + nilai;
        } while (ke < banyak);
        System.out.println();
        rata = (rata + totalNilai) / banyak;
        System.out.println("Maka, Rata-rata Nilainya adalah "+ rata);
        System.out.println("Developed By : Muhammad Ardhan Aryatama");
    }
    
}
