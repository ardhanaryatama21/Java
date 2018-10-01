/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Waktu saat ini
 */
package pbo2.pkg10117069.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PBO210117069Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        SimpleDateFormat formatIndo= new SimpleDateFormat();
        
        String[] strDays = new String[]{"Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari ini adalah hari : " + (strDays[daysOfWeek]) + "," + formatIndo.format(date));
    }
    
}
