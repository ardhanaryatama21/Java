/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan jumlah kambing
 */
package pbo2.pkg10117069.latihan5.kambing.global;

public class PBO210117069Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    int jumlahKambing = 88;
    
    public void getjumlahkambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);       
    }
    
    public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210117069Latihan5KambingGlobal kambingSusu = new 
        PBO210117069Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getjumlahkambing();
        
        // Menambahkan satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getjumlahkambing();
    }
    
}
