/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Nilai Terbesar Terkecil
 */
package pbo2.pkg10117069.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

public class Nilai {
    
    public int jumlahMhs;
    public int nBesar = 0;
    public int nKecil = 100;
    public int nilaiMhs[] = new int[50];
    Scanner scan = new Scanner(System.in);
    
    public void inputJumlahMhs(){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scan.nextInt();
    }
    public int hitungNilaiTerbesar(int i){
    return nBesar = ((nBesar <= nilaiMhs[i]) ? nilaiMhs[i] : nBesar);
    }
    public int hitungNilaiTerkecil(int i){
    return nKecil = ((nKecil >= nilaiMhs[i]) ? nilaiMhs[i] : nKecil);
    }
    public void hasilNilaiMhs(){
        System.out.println(" ");
        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for (int i = 0; i < jumlahMhs; i++){
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + "=" + nilaiMhs[i] + " ");
        }
    }
}
