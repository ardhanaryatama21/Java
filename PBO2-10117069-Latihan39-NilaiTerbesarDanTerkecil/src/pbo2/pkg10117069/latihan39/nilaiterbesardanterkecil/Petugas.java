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

public class Petugas {
    
    public String nama;
    Nilai nilaiMhs = new Nilai();
    Scanner scan = new Scanner(System.in);
    
    public void inputNama(){
        System.out.print("Masukkan Nama Petugas : ");
        nama = scan.next();
    }
}
