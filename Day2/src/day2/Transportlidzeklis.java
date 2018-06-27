
package day2;


public class Transportlidzeklis {
    
    public String razotajs;
    public String marka;
    public int gads;

    public Transportlidzeklis(String razotajs, String marka, int gads) {
        this.razotajs = razotajs;
        this.marka = marka;
        this.gads = gads;
    }

    /*@Override
    public String toString() {
        return "Transportlidzeklis{" + "razotajs=" + razotajs + ", marka=" + marka + ", gads=" + gads + '}';
    }*/
    
    public String toString() {
        return String.format("Ražotājs = %s, marka = %s, gads = %s", razotajs, marka, gads);
        
    }
    
    
    
    
}
