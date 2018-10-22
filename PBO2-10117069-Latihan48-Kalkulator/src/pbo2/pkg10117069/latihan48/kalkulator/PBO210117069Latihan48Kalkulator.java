/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Kalkulator
 */
package pbo2.pkg10117069.latihan48.kalkulator;

public class PBO210117069Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator ktr = new Kalkulator();
        ktr.setValue1(7);
        ktr.setValue2(5);
        System.out.println("VALUE 1 = "+ktr.getValue1());
        System.out.println("VALUE 2 = "+ktr.getValue2());
        ktr.setNameProject();
        ktr.setNoteProject(null);
        System.out.println("Result Add is = "+ktr.add(ktr.getValue1(), ktr.getValue2()));
        System.out.println("Result Minus is = "+ktr.minus(ktr.getValue1(), ktr.getValue2()));
        System.out.println("Result Multiplication is = "+ktr.multiplication(ktr.getValue1(), ktr.getValue2()));
        System.out.println("Result Division is = "+ktr.division(ktr.getValue1(), ktr.getValue2()));      
    }
}
