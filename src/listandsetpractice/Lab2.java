package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("111", "Princess Buttercup", 'f');
        Employee e2 = new Employee("222", "Dread Pirate Roberts", 'm');
        Employee e3 = new Employee("333", "Inigo Montoya", 'm');
        
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for (Employee e : employees) {
            System.out.println("ID: " + e.getEmpId());
            System.out.println("Name: " + e.getEmpName());
            System.out.println("Gender: " + e.getGender());
        }
    }
}
