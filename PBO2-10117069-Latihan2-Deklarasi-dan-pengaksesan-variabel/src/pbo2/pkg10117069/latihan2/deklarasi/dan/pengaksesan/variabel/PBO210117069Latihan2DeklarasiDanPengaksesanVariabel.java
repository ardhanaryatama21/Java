/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk mendeklarasikan dan 
   mengakses variabel
 */
package pbo2.pkg10117069.latihan2.deklarasi.dan.pengaksesan.variabel;

public class PBO210117069Latihan2DeklarasiDanPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiInt;
        final double PHI = 3.14;
        boolean nilaiLogika;
        char nilaiKarakter;
       
        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai\t= " + nilaiInt);
        System.out.println("Isi variabel PHI\t= " + PHI);
        System.out.println("Isi variabel logika\t= " + nilaiLogika);
        System.out.println("Isi variabel Karakter\t= " + nilaiKarakter);        
    }
    
}
