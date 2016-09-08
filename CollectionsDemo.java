/*
 * Deborah Lewis
 * Learning about collections in Java
 */
package collectionsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {


    public static void main(String[] args) {
        
        Collection<String> c = new LinkedList<String>();
        
        c.add("Nikki"); //add Nikki
        c.add("Tony"); //add Tony
        c.add("Jasper"); //add Jasper
        
        Iterator<String> iterator = c.iterator(); //create iterator
        int i = 1; //counter
        while (iterator.hasNext()) { //while other objects exist in the collection
            String o = iterator.next(); 
            if (o.startsWith("T")) {//if the object starts with T
                c.remove(o); //remove the object
            }
            
            System.out.println(i + " " + o); //display object
            i++; //increment counter
        }
        
        for (String o : c) {
            System.out.println(o.length());
        }
    }
    
}
