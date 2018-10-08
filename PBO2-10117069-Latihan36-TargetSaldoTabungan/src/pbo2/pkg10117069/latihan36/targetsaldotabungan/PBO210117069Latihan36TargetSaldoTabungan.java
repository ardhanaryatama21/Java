/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Target saldo tabungan
 */
package pbo2.pkg10117069.latihan36.targetsaldotabungan;

public class PBO210117069Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tbn = new Tabungan();
        
        tbn.saldo = 3500000;
        tbn.bunga = 8;
        int saldoTarget = 6000000;
        
        tbn.hitungLamaSaldoTarget(tbn.saldo, saldoTarget);
        
    }
    
}
