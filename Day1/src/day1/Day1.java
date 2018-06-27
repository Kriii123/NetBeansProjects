
package day1;


public class Day1 {

    
    public static void main(String[] args) {
        
        Kvadrats kv1 = new Kvadrats();
        
        kv1.setMalasGarums(5.5);
        kv1.setKrasa("sarkans");
        
        double laukums = kv1.laukums();
        double perimetrs = kv1.perimetrs();
        
        Kvadrats kv2 = new Kvadrats(6, "melns");
        laukums = kv2.laukums();
        perimetrs = kv2.perimetrs();
        
        System.out.println("Kvadāta 2 laukums ir " + laukums);
        System.out.println("Kvadāta 2 perimetrs ir " + perimetrs);
        System.out.println("Kvadāta 1 krāsa ir " + kv1.getKrasa());
        
        
        Telpa algebrasTelpa = new Telpa(402, 4);
        Skolotajs algebrasPasniedzejs = 
                new Skolotajs("Ivars","Pētersons","i.petersons@gmail.com");
        MacibuPrieksmets prieksmets = 
                new MacibuPrieksmets("Algebra", algebrasTelpa, algebrasPasniedzejs);
        Klase karlaKlase = new Klase("12a", 22, algebrasTelpa);
        Skolens skolens = new Skolens("Kārlis","Bērziņš","k.berzins@gmail.com", 1998, karlaKlase);
        Vertejums v = new Vertejums(prieksmets, skolens, 9);
        
        
        System.out.println(v.Informacija());
        
        
        
        Auto auto = new Auto();
        Lidmasina lidmasina = new Lidmasina();
        
        auto.parvietoties();
        lidmasina.parvietoties();
       
        Direktors d = new Direktors();
        d.vards = "Jānis";
        d.uzvards = "Bērziņš";
        //System.out.println(d.toString());
        
        darbiniekaVards(d);
        
    }
    static void darbiniekaVards(Darbinieks d){
        System.out.println(d.toString());
    }
    
    static void parvietot(TransportaLidzeklis tr){
        tr.parvietoties();
    }
    
}
