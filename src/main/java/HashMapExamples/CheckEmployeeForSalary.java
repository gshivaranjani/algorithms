package HashMapExamples;

public class CheckEmployeeForSalary implements CheckEmployee{
    @Override
    public boolean test(Employee e) {
        return e.getSalary()>2000 && e.getExp()>3;
    }
}
