package listandsetpractice;

public class Employee {

    private String empId;
    private String empName;
    private char gender;

    public Employee(String empId, String empName, char gender) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ID: " + empId 
                + "\nName: " + empName
                + "\nGender: " + gender;
    }
}
