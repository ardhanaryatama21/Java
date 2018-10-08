/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       rata rata nilai
 */
package pbo2.pkg10117069.latihan37.programrataratanilai;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class PBO210117069Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        Scanner scan = new Scanner(System.in);
        
        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scan.nextInt();
        
        mhs.hitungTotalNilai(mhs.nilaiMhs, n);
        mhs.hitungRataRataNilai(mhs.totalNilaiMhs, n);
        System.out.println(" ");
        System.out.println("Maka, Rata-rata Nilainya adalah " + 
        mhs.hitungRataRataNilai(mhs.totalNilaiMhs, n));
        System.out.println("Developed by : Muhammad Ardhan Aryatama");
    }
    
}
