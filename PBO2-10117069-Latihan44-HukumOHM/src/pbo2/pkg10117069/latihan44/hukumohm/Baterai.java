/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Hukum OHM
 */
package pbo2.pkg10117069.latihan44.hukumohm;

public class Baterai {
    private float kuatArus;
    private float hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====");    
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n"
                + "akan berbanding lurus dengan beda potensial\npada ujung-ujung"
                + " kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan\n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus = 3;
    }

    public float getHambatan() {
        return hambatan = 12;
    }
    public float hitungTegangan(){
    return kuatArus*hambatan;
    }
}
