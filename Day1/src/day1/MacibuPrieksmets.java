
package day1;


public class MacibuPrieksmets {
    
    private String nosaukums;
    private Telpa telpa;
    private Skolotajs pasniedzejs;

    public MacibuPrieksmets(String nosaukums, Telpa telpa, Skolotajs pasniedzejs) {
        this.nosaukums = nosaukums;
        this.telpa = telpa;
        this.pasniedzejs = pasniedzejs;
    }

    public String getNosaukums() {
        return nosaukums;
    }

    public Skolotajs getPasniedzejs() {
        return pasniedzejs;
    }

    @Override
    public String toString() {
        return "MacibuPrieksmets{" + "nosaukums=" + nosaukums + '}';
    }
    
    
    

    
    
    
}
