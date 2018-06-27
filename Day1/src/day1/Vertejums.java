
package day1;


public class Vertejums {
    
    private MacibuPrieksmets prieksmets;
    private Skolens skolens;
    private int atzime;

    public Vertejums(MacibuPrieksmets prieksmets, Skolens skolens, int atzime) {
        this.prieksmets = prieksmets;
        this.skolens = skolens;
        this.atzime = atzime;
    }

    

   
    

    public int getAtzime() {
        return atzime;
    }

    public void setAtzime(int Atzime) {
        this.atzime = Atzime;
    }
    
    public String Informacija(){
        
        return "Skolēna vārds - " 
                + this.skolens.getVards() 
                +" "
                + skolens.getUzvards() 
                + ", Priekšmets = " 
                + this.prieksmets.getNosaukums()
                + ", Pasniedzēja vārds - " 
                + this.prieksmets.getPasniedzejs()
                + ", Atzīme = " 
                + this.atzime;
    }
}
