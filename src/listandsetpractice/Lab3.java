package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {

    public static void main(String[] args) {
        Employee e1 = new Employee("111", "Princess Buttercup", 'f');
        Employee e2 = new Employee("222", "Dread Pirate Roberts", 'm');
        Employee e3 = new Employee("333", "Inigo Montoya", 'm');

        Dog d1 = new Dog("Tag", 17, "A123");
        Dog d2 = new Dog("Doodles", 2, "B456");
        Dog d3 = new Dog("Scribbles", 3, "C789");

        List breathers = new ArrayList();
        breathers.add(e1);
        breathers.add(e2);
        breathers.add(e3);
        breathers.add(d1);
        breathers.add(d2);
        breathers.add(d3);

        for (int i = 0; i < breathers.size(); i++) {
            Object o = breathers.get(i);
            if (o instanceof Employee) {
                Employee emp = (Employee) o;
                System.out.println("ID: " + emp.getEmpId());
                System.out.println("Name: " + emp.getEmpName());
                System.out.println("Gender: " + emp.getGender());
            } else if (o instanceof Dog) {
                Dog dog = (Dog) o;
                System.out.println("ID: " + dog.getRabiesId());
                System.out.println("Name: " + dog.getName());
                System.out.println("Age: " + dog.getAge());
            }
        }
        System.out.println("----------------------");

        for (int i = 0; i < breathers.size(); i++) {
            Object o = breathers.get(i);
            System.out.println(o.toString());
        }
    }
}
