/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Nilai terbesar dan terkecil
 */
package pbo2.pkg10117069.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

public class PBO210117069Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int banyak;
        String petugas;
        int max = 0;
        int min = 100;
        int nilaiMhs[] = new int[10];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-----Program Nilai Terbesar dan Terkecil Nilai Mahasiswa-----");
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scan.next();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyak = scan.nextInt();
        
        for (int i = 1; i <= banyak; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+" = ");
            nilaiMhs[i] = scan.nextInt();
            
            max = ((max <= nilaiMhs[i]) ? nilaiMhs[i] : max );
            min = ((min >= nilaiMhs[i]) ? nilaiMhs[i] : min );
        }
        System.out.println(" ");
        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for(int i = 1; i <= banyak; i++){
        
            System.out.println("Nilai Mahasiswa ke-"+ i + " = " + nilaiMhs[i]);    
        }
        
        System.out.println(" ");
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println(" ");
        System.out.println("Petugas : " + petugas);
    }
    
}
