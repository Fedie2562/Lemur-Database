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
    String habitat, classification, coat;
    public Lemur(){
        super();
        habitat = "Madagascar";
        classification = "Prosimian";
        coat = "Fur";
    }
    public String toString(){
        String output = super.toString();
        output += "Habitat : "+habitat+"\n";
        output += "Classification : "+classification+"\n";
        output += "Coat : "+coat+"\n";
        return output;
    }
}
