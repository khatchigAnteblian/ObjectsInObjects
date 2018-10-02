/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsinobjects;

/**
 *
 * @author 345983704
 */
public class Pantry {
    
    private final Jam[] jars = new Jam[3];
    
    public Pantry(Jam jar1, Jam jar2, Jam jar3) {
        jars[0] = jar1;
        jars[1] = jar2;
        jars[2] = jar3;
    }
    
}
