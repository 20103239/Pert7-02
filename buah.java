
package pert702;

/**
 *
 * @author Kristina 20103239
 */
public class buah {
    private String NAMA, WARNA;
    protected double Harga;
    
    public void setNAMA (String N){
       this.NAMA = N;
    }
    
    public String getNAMA(){
        return this.NAMA;
    }
    
    public void setWARNA (String color){
        this.WARNA = color;
    }
    
    public String getWARNA(){
        return this.WARNA;
    }
    
    public void setHARGA(double H){
        this.Harga = H;
    }
    
    public double getHARGA(){
        return this.Harga;
    }
    
    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah");
        System.out.println("Nama Buah :"+this.NAMA);
        System.out.println("Harga     :"+this.Harga);
        System.out.println("Warna     :"+this.WARNA);
        
    }
    
}
