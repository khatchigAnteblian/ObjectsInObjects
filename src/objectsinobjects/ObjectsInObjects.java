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
public class ObjectsInObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jam jam1 = new Jam("Apple Jam", "06/12/01",25);
        
        System.out.println(jam1.isEmpty());
        
        jam1.spreadOnToast(30);
        
        jam1.printInfo();
    }
    
}
