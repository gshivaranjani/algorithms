package HashMapExamples;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee();
        List<Employee> list = emp.generateData();

        for(Employee e : list){
            if(e.getSalary()>3000)
                System.out.println(e.toString());
        }
        System.out.println("--------------------------");

        printEmployee(list,new CheckEmployeeForSalary());
    }

    public static void printEmployee(List<Employee> list, CheckEmployee tester){
        for(Employee e : list){
            if(tester.test(e)){
                System.out.println(e.toString());
            }
        }
    }
}
