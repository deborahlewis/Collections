/*
 * Deborah Lewis
 * Learning about collections in Java
 */
package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {


    public static void main(String[] args) {
        
        List c = new ArrayList(); //create array list
        
        c.add("Deborah"); //add to array
        c.add("David"); //add to array
        c.add(0, "Jasper"); //add to first position in array
        
        c.remove("Deborah"); //remove from array
        
        System.out.println("count" + c); //disaplay size of arraylist
        
        System.out.println("count " + c.indexOf("Jasper"));
        
    }
    
}
