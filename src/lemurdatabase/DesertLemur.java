/*
 * Ferris D.
 * 27/11/2018
 */

package lemurdatabase;

/**
 *
 * @author fedie2562
 */
public class DesertLemur extends Lemur {
    String groupSize;
    public DesertLemur(){
        super();
        habitat += ", Desert";
        breed = "Desert Lemur";
        coat += ", White";
        groupSize = "Small";
    }
    public String toString(){
        String output = super.toString();
        output += "Group Size : " + groupSize + "\n";
        output += breed;
        return output;
    }
}
