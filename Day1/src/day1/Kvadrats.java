
package day1;

public class Kvadrats {
    
   private double MalasGarums; // pēc noklusējuma protected - pieejams arī citās klasēs
   
   private String Krasa;
   
   public Kvadrats(){
       
   }

    public Kvadrats(double MalasGarums, String Krasa) {
        this.MalasGarums = MalasGarums;
        this.Krasa = Krasa;
    }
   
   

    public void setMalasGarums(double MalasGarums) {
        
        if(MalasGarums>0){
            MalasGarums=0;
        }
        this.MalasGarums = MalasGarums;
    }
//lai uzstāditu vērtības, kuras nedrīkst parādīties pēc tam.
    public void setKrasa(String Krasa) {
        this.Krasa = Krasa;
    }

    public double getMalasGarums() {
        return MalasGarums;
    }

    public String getKrasa() {
        return Krasa;
    }
   
    public double laukums(){
        return MalasGarums*MalasGarums;
    }
    public double perimetrs(){
        return MalasGarums*4;
       
    }
   
   
}
