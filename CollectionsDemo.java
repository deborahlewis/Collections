/*
 * Deborah Lewis
 * Learning about collections in Java
 */
package collectionsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {


    public static void main(String[] args) {
        
        List c = new ArrayList(); //create array list
        
        c.add("Deborah"); //add to array
        c.add("David"); //add to array
        c.add("Christie"); //add to array
        c.add("Dawson"); //add to array
        //c.add(0, "Jasper"); //add to first position in array
        
        //c.remove("Deborah"); //remove from array
        
        System.out.println("count" + c); //disaplay size of arraylist
        
        //System.out.println("position " + c.indexOf("Jasper")); //display location of Jasper in array
        
        //print each item within the array using iterator
        Iterator iterator = c.iterator(); //create iterator (found in all collections classes)
        int i = 1; //counter
        while (iterator.hasNext()) { //while there are other objects within the collection
            Object o = iterator.next(); // go to next object
            System.out.println(i + " " + o.toString()); //print string value of object numbered
            i++; //increment counter
        }

        c.remove("Dawson"); //remove from array
        
        //alternative method
        for (Object o : c) { //for object object o is in c
            if (o.toString().startsWith("C")) {
                c.remove(o); //remove any objects that start with the letter C
            }
            System.out.println(c.toString()); //print items from collection
        }
        
        
        
    }
    
}
