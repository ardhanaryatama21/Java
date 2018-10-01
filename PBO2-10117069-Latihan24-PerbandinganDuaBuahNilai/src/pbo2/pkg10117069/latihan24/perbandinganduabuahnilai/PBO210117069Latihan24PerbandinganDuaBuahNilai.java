/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Perbandingan dua buah nilai
 */
package pbo2.pkg10117069.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

public class PBO210117069Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil;
        String ulang;
        int nilaiA;
        int nilaiB;
        Scanner scan = new Scanner(System.in);
      
        do{ 
          
        System.out.println("-----Program Perbandingan Nilai-----");
        System.out.print("Masukkan Nilai Pertama : ");
        nilaiA = scan.nextInt();
        System.out.print("Masukkan Nilai Kedua   : ");
        nilaiB = scan.nextInt();
       
       if(nilaiA < nilaiB){
        System.out.println("Hasil : " + nilaiA + " Lebih kecil dari " + nilaiB);
        }else if(nilaiA > nilaiB){
        System.out.println("Hasil : " + nilaiA + " Lebih besar dari " + nilaiB);
        } 
        System.out.println("");
        System.out.print("Ulangi Aktifitas ? (ya/tidak) : ");
        ulang = scan.next();
        System.out.println("");
      }while("ya".equals(ulang));  
    }
    
}
