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
public class Jam {
    
    String content;
    String date;
    int size;
    
    public Jam(String c, String d, int s){
        content = c;
        date = d;
        size = s;
    }
    
    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }
    
    
}
