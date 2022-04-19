
package pert702;

/**
 *
 * @author Kristina 20103239
 */
public class Pert702 {

    public static void main(String[] args) {
        buah B = new buah ();
        
        B.setNAMA("Anggur");
        B.setWARNA("Ungu");
        B.setHARGA(15000);
        B.TampilInfo();
        
        apel A = new apel ();
        
        A.setNAMA("Apel Merah");
        A.setWARNA("Merah");
        A.setHARGA(3500);
        A.TampilInfo();
    }
    
}
