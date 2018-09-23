/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan jumlah kambing
 */
package pbo2.pkg10117069.latihan6.kambing.pkgstatic.kostanta;



public class PBO210117069Latihan6KambingStaticKostanta {

    /**
     * @param args the command line arguments
     */
    
    public static final String Nama_Kambing = "Midun";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(Nama_Kambing + " memiliki kambing sebanyak " 
                + Mamalia.jumlahKambing);
    }
    
}
