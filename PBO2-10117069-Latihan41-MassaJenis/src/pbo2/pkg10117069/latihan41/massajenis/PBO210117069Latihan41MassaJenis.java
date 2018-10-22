/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Massa Jenis
 */
package pbo2.pkg10117069.latihan41.massajenis;

public class PBO210117069Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus objKbs = new Kubus();
        
        System.out.println("======Massa Jenis Kubus======");
        objKbs.setSisi(5);
        objKbs.setMassa(250);
        
        System.out.println("Sisi\t: "+objKbs.getSisi());
        System.out.println("Massa\t: "+objKbs.getMassa());
        
        System.out.println("\n======Hasil Perhitungan======");
        
        System.out.println("Volume\t\t: " + objKbs.hitungVolume(objKbs.getSisi()));
        System.out.println("Massa Jenis \t: " + objKbs.hitungMassaJenis(objKbs.getMassa(), objKbs.getSisi()));
    }
    
}
