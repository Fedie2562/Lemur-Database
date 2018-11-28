/*
 * Ferris D.
 * 27/11/2018
 */

package lemurdatabase;

/**
 *
 * @author fedie2562
 */
public class Lemur extends Mammal {
    String habitat = "Madagascar";
    String classification = "Prosimian";
    String coat = "Fur";
    public Lemur(){
        super();
        
    }
    public String toString(){
        String output = super.toString();
        output += "Habitat : "+habitat+"\n";
        output += "Classification : "+classification+"\n";
        output += "Coat : "+coat+"\n";
        return output;
    }
}
