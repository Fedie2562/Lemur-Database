/*
 * Ferris D.
 * 27/11/2018
 */

package lemurdatabase;

/**
 *
 * @author fedie2562
 */
public class TreeLemur extends Lemur {
    String groupSize;
    public TreeLemur(){
        super();
        habitat += ", Trees";
        breed = "Tree Lemur";
        coat += ", Red";
        groupSize = "Large";
    }
    public String toString(){
        String output = super.toString();
        output += "Group Size : " + groupSize + "\n";
        output += breed;
        return output;
    }
}
