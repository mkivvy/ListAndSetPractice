package listandsetpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        System.out.println("-----------------------------------");
        groceryList.addAll(getTheseToo);
        for (String s : groceryList) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------");
        groceryList.remove(4);
        groceryList.set(3, "Sprinkles");

        for (String s : groceryList) {
            System.out.println(s);
        }

        //The following will swap 2 items in the list: item 5 (Napkins) is 
        //stored in the String tmp; at index 5 the value is set to item 3
        //(Sprinkles); tmp (Napkins) is then set at index 3.
        //Napkins is now #3 and Sprinkles is now #5 
        swap(groceryList, 5, 3);

        System.out.println("------After swap------------------------");
        for (String s : groceryList) {
            System.out.println(s);
        }

        shuffle(groceryList, new Random());
        System.out.println("------After shuffle---------------------");
        for (String s : groceryList) {
            System.out.println(s);
        }

//        boolean itIsHere = groceryList.contains("Sprinkles");
//        System.out.println("List contains Sprinkles? " + itIsHere);
//        itIsHere = groceryList.contains("Graham crackers");
//        System.out.println("List contains Graham crackers? " + itIsHere);
//        itIsHere = groceryList.containsAll(getTheseToo);
//        System.out.println("List contains getTheseToo? " + itIsHere);


    }

    //copied from Java tutorial
    private static void swap(List<String> list, int i, int j) {
        String tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
    
    //copied from Java tutorial
    //This method randomly changes the order of the list using the specified 
    //source of randomness. It startsfrom the bottom of the list, repeatedly 
    //swapping a randomly selected element into the current position. 
    //Unlike most naive attempts at shuffling, it's fair (all permutations occur 
    //with equal likelihood, assuming an unbiased source of randomness) and fast 
    //(requiring exactly list.size()-1 swaps). 
    public static void shuffle(List<String> list, Random rnd) {
        for (int i = list.size(); i > 1; i--) {
            swap(list, i - 1, rnd.nextInt(i));
        }
    }
}
