/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan program saldo tabungan
 */
package pbo2.pkg10117069.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO210117069Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal = 3500000;
        int bunga     = saldoAwal*8/100;
        int total     = saldoAwal;
        int lama      = 0;
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        do {
            lama = lama + 1;
            total = total+(total*8/100);
            System.out.print("Saldo dibulan ke-"+lama+" ");
            formatRp.setCurrencySymbol("Rp.");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            System.out.println(kursIndonesia.format(total));
            
        } while (total <= 6000000);
    }
    
}
