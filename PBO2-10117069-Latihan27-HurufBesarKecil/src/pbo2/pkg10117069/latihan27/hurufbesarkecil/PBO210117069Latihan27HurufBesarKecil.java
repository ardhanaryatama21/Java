/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Huruf besar dan kecil
 */
package pbo2.pkg10117069.latihan27.hurufbesarkecil;

import java.util.Scanner;

public class PBO210117069Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String kalimat;
        String besar;
        String kecil;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scan.nextLine();
        
        besar = kalimat.toUpperCase();
        kecil = kalimat.toLowerCase();
        
        System.out.println(" ");
        System.out.println("----Hasil Formating----");
        System.out.println("Huruf Besar : " + besar);  
        System.out.println("Huruf Kecil : " + kecil);
    }
    
}
