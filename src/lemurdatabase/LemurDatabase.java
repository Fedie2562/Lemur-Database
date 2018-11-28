/*
 * Ferris D.
 * 27/11/2018
 *
 */

package lemurdatabase;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        List lemurList = new ArrayList();
        int tL,dL,jL;
        tL=Integer.parseInt(JOptionPane.showInputDialog("How many Tree Lemurs will be created ?"));
        dL=Integer.parseInt(JOptionPane.showInputDialog("How many Desert Lemurs will be created ?"));
        jL=Integer.parseInt(JOptionPane.showInputDialog("How many Jungle Lemurs will be created ?"));
        int totalLemurs = tL + dL + jL;
        // Tree Lemurs
        for(int i = 0;i<tL;i++){
            System.out.println("Creating a Tree Lemur");
            TreeLemur tLemur = new TreeLemur();
            lemurList.add(tLemur);
        }
        // Desert Lemur
        for(int i = 0;i<dL;i++){
            System.out.println("Creating a Desert Lemur");
            DesertLemur dLemur = new DesertLemur();
            lemurList.add(dLemur);
        }
        // Jungle Lemur
        for(int i = 0;i<jL;i++){
            System.out.println("Creating a Jungle Lemur");
            JungleLemur jLemur = new JungleLemur();
            lemurList.add(jLemur);
        }
        // Display Information
        for(int i = 0;i<totalLemurs;i++){
            System.out.println(""+lemurList.get(i).toString());
        }
    }
    public static int random(int min, int max){
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }
    
}
