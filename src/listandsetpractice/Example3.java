package listandsetpractice;

import java.util.*;

/**
 *
 * @author Mary
 */
public class Example3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido", 3, "a");
        Dog dog2 = new Dog("Max", 2, "b");
        Dog dog3 = new Dog("Fido", 3, "a");
        
//        Set dogSet = new HashSet();
//        dogSet.add(dog1);
//        dogSet.add(dog2);
//        dogSet.add(dog3);
//        System.out.println(dogSet.size());
        
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs.size());
        
        //Set is same as List, but w/ duplicates removed
        Set dogSet = new HashSet(dogs);
        //following redefines original dogs List to get a List w/o dups
        dogs = new ArrayList<Dog>(dogSet);
        System.out.println(dogs.size());
    }
}
