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
import java.util.Scanner;
public class ObjectsInObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Setting up jams
        Jam jam1 = new Jam("Apple", "06/12/01",25);
        Jam jam2 = new Jam("Banana", "25/12/01", 30);
        Jam jam3 = new Jam("Pineapple", "12/04/13", 40);

        // Checking whether everything is working correctly
        Pantry pantry = new Pantry(jam1, jam2, jam3);
        pantry.printContent();
        pantry.spreadJam(2, 15);
        pantry.printContent();
    }
    
}
