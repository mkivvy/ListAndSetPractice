package listandsetpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mary
 */
public class Example1 {

    public static void main(String[] args) {
        //OLD
//        List groceryList = new ArrayList();
//        groceryList.add("Chocolate");
//        groceryList.add("Milk");
//        groceryList.add("Yogurt");
//        groceryList.add("Graham crackers");
//        
//        //had to cast prior to JDK5:
//        String item = (String)groceryList.get(1);
//        System.out.println(groceryList.size());
//        groceryList.remove(2);
//        System.out.println(groceryList.size());
//        
//        for(int i=0; i < groceryList.size(); i++){
//            String s = (String)groceryList.get(i);
//            System.out.println(s);
//        }
        
        //NEW
        //after JDK5, you can specify object type in declaration
        List<String> groceryList = new ArrayList<String>();
        //for JDK 7 only, this declaration is allowed:
        //List<String> groceryList = new ArrayList<>();
        groceryList.add("Chocolate");
        groceryList.add("Milk");
        groceryList.add("Yogurt");
        groceryList.add("Graham crackers");
        groceryList.add("Milk");
        
        //no casting needed
        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        
        List<String> getTheseToo = new ArrayList<String>();
        getTheseToo.add("Ice cream");
        getTheseToo.add("Napkins");
        for (String s : getTheseToo) {
            System.out.println(s);
        }
        
//        System.out.println("-----------------------------------");
//        groceryList.addAll(getTheseToo);
//        for (String s : groceryList) {
//            System.out.println(s);
//        }
//        
//        System.out.println("-----------------------------------");
//        groceryList.remove(3);
//        groceryList.set(4, "Sprinkles");
//        
//        for (String s : groceryList) {
//            System.out.println(s);
//        }
        
        System.out.println("-----------------------------------");
        boolean itIsHere = groceryList.contains("Sprinkles");
        System.out.println("List contains Sprinkles? " + itIsHere);
        itIsHere = groceryList.contains("Graham crackers");
        System.out.println("List contains Graham crackers? " + itIsHere);
        //why is this false?
        itIsHere = groceryList.containsAll(getTheseToo);
        System.out.println("List contains getTheseToo? " + itIsHere);
        
//        System.out.println("-----------------------------------");
//        getTheseToo.clear();
//        for (String s : getTheseToo) {
//            System.out.println("Anything?");
//            System.out.println(s);
//        }
        
    }
}
