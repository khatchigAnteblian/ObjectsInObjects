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
        Pantry pantry = new Pantry(jam1, jam2, jam3);

        //Setting up scanner and variables
        Scanner sc = new Scanner(System.in);
        int jarNum, amount;

        // Welcome user
        System.out.println("Welcome to JAVA Pantry!\n");

        // Start infinite loop
        while (true) {
            // Print content of jars, then ask user for input
            System.out.println("The jams are:\n");
            pantry.printContent();
            System.out.print("Enter selection (1, 2, 3): ");
            jarNum = sc.nextInt();

            // Stop when user enters -1
            if (jarNum == -1) { break; }

            System.out.print("Enter amount: ");
            amount = sc.nextInt();

            pantry.spreadJam(jarNum, amount);
        }

        System.out.println("Goodbye!");
    }
    
}
