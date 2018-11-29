/*
 * Ferris D.
 * 27/11/2018
 */

package lemurdatabase;

/**
 *
 * @author fedie2562
 */
public class JungleLemur extends Lemur {
    public JungleLemur() {
        super();
        habitat += ", Jungle";
        breed = "Jungle Lemur";
        coat += ", Black or Blue";
    }
    public String toString(){
        String output = super.toString();
        output += breed;
        return output;
    }
}
