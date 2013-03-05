package listandsetpractice;

import java.util.List;
import java.util.Vector;

public class Lab1 {
    public static void main(String[] args) {
        String hobbyItem1 = "piano";
        String hobbyItem2 = "guitar";
        String hobbyItem3 = "music";
        
        List hobbyItems = new Vector();
        hobbyItems.add(hobbyItem1);
        hobbyItems.add(hobbyItem2);
        hobbyItems.add(hobbyItem3);
        
        for (int i = 0; i < hobbyItems.size(); i++) {
            String s = (String)hobbyItems.get(i);
            System.out.println(s);
        }
    }
}
