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

public class PBO210117069Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Petugas ptg = new Petugas();
        Nilai nMhs = new Nilai();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-----Program Nilai Terbesar dan Terkecil-----");
        ptg.inputNama();
        nMhs.inputJumlahMhs();
        
        for (int i = 0; i< nMhs.jumlahMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + " = ");
            nMhs.nilaiMhs[i] = scan.nextInt();
            nMhs.hitungNilaiTerbesar(i);
            nMhs.hitungNilaiTerkecil(i);
        }
        nMhs.hasilNilaiMhs();
        System.out.println(" ");
        System.out.println("Nilai Terbesar adalah " + nMhs.nBesar);
        System.out.println("Nilai Terkecil adalah " + nMhs.nKecil);
        System.out.println("Petugas : " + ptg.nama);
    }
    
}
