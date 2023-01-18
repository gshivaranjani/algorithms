package HashMapExamples;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private Double salary;
    private int exp;

    public Employee(String name, String dept, Double salary, int exp) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.exp = exp;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", exp=" + exp +
                '}';
    }

    public List<Employee> generateData() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("shiva","D001",1000.0,5));
        list.add(new Employee("malay","D002",2000.0,2));
        list.add(new Employee("sushree","D003",5000.0,10));
        list.add(new Employee("gayatri","D001",3000.0,4));

        return list;
    }
}
