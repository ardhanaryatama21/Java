/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Biaya Emas Kawin
 */
package pbo2.pkg10117069.latihan49.biayaemaskawin;

public class PBO210117069Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas ems = new Emas(15.7);
        System.out.println("=====Biaya Emas Kawin=====");
        System.out.println("Harga Emas saat ini Rp."+ems.getHarga()+"/gram");
        System.out.println("Emas yang ingin dibeli Hendi : "+ems.getBerat()+" gram");
        System.out.println("Total biaya yang harus dikeluarkan Hendi Rp."+ems.hargaEmas(ems.getBerat(), ems.getHarga()));
    }
    
}
