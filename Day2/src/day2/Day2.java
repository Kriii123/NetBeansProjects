
package day2;



public class Day2 {

    public static void main(String[] args) {
       
        
       Kvadrats kv1 = new Kvadrats();
       kv1.malasGarums = 5.4;
       kv1.krasa = "zils";
       
       System.out.println("Kvadrāta perimetrs = " + kv1.perimetrs());
       System.out.println("Kvadrāta krāsa = " + kv1.krasa());
       System.out.println("Kvadrāta laukums = " + kv1.laukums());
       
       
       Aplis aplis1 = new Aplis();
       aplis1.radiuss = 3.8;
       aplis1.krasa = "Sarkans";
       
       System.out.println("Apļa perimetrs = " + aplis1.perimetrs());
       System.out.println("Apļa krāsa = " + aplis1.krasa());
       System.out.println("Apļa laukums = " + aplis1.laukums());
       
       
       Kravas krava = new Kravas("Kamaz", "z200", 1988, 14);
       System.out.println(krava.toString());
       
       Pasazieru pasazieru = new Pasazieru("Škoda", "Octavia", 2017, 5);
       System.out.println(pasazieru.toString());
       
       
       
        
    }
    
    
}
