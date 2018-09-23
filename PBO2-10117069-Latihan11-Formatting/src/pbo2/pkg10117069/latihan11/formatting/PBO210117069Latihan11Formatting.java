/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan operasi formatting
 */
package pbo2.pkg10117069.latihan11.formatting;

public class PBO210117069Latihan11Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3546764;
        int iMinus = -1;
        System.out.println("i : " + i);
        System.out.printf("%%d    : %d%n", i);
        System.out.printf("%%10d  : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f      : %f%n", f);
        System.out.printf("%%.2f    : %.2f%n", f);
        System.out.printf("%%12.2f  : %12.2f%n", f);
        System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
    
}
