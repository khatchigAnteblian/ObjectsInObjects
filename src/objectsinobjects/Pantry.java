/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package objectsinobjects;

/**
 *
 * @author 345983704
 */
public class Pantry {
    
    // Set up an array to hold three jars
    private final Jam[] jars = new Jam[3];
    
    public Pantry() {
        // A default constructor to create three jams when no
        // parameters are entered
        jars[0] = new Jam("Strawberry", "01/01/1970", 25);
        jars[1] = new Jam("Marmelade", "01/01/1970", 25);
        jars[2] = new Jam("Blueberry", "01/01/1970", 25);
    }

    public Pantry(Jam jar1, Jam jar2, Jam jar3) {
        // Populate array with given objects
        jars[0] = jar1;
        jars[1] = jar2;
        jars[2] = jar3;
    }
    
    public void printContent() {
        // Loop through jars and call the printInfo method on each one
        for (int i=0; i<3; i++) {
            System.out.print("Jam " + (i + 1) + ": ");
            jars[i].printInfo();
        }
    }

    public void spreadJam(int jarNum, int amount) {
        // Call spreadOnToast method of selected jar
        jars[jarNum - 1].spreadOnToast(amount);
    }
}
