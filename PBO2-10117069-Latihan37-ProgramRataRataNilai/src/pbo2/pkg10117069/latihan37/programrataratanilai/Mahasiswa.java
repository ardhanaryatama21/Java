/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       rata rata nilai
 */
package pbo2.pkg10117069.latihan37.programrataratanilai;

import java.util.Scanner;

public class Mahasiswa {
    
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scan = new Scanner(System.in);
    
    public double hitungTotalNilai(int parNilaiMhs, int parN){
    for(int i = 1; i <= parN ; i++){
        System.out.print("Nilai Mahasiswa ke-" + i + " : ");
        parNilaiMhs = scan.nextInt();
        totalNilaiMhs += parNilaiMhs;
    }
        return totalNilaiMhs;
    }
    public double hitungRataRataNilai(double total, int nMhs){
    return total/nMhs;
    }
}
