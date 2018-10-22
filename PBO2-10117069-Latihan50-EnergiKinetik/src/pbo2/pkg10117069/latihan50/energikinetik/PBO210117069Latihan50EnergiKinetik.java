/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Energi Kinetik
 */
package pbo2.pkg10117069.latihan50.energikinetik;

public class PBO210117069Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik etk = new EnergiKinetik();
        etk.setMassa(145);
        etk.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa " + etk.getMassa()
                + " g" + " dilempar dengan kecapatan "+etk.getKecepatan()+" m/s");
        
        double massa = etk.getMassa();
        double kecepatan = etk.getKecepatan();
        
        System.out.println("A. Energi Kinetik = "+ etk.energiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola dari keadaan diam = "+ etk.usaha());
        
    }
    
}
