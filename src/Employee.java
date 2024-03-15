import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private  int id;
   private String name;
   private double salary;

    public static void main(String[] args) {
        Employee[] arrayOfEmp={
                new Employee(1,"jennifer ",10000),
                new Employee(2,"mark",20000),
                new Employee(3,"dhruva reddy",30000)
        };
        List<Employee> empList = Arrays.asList(arrayOfEmp);
//        using peek to look at the intermediate operation that are performed
        ArrayList<?> arrayList = (ArrayList<?>) empList.stream().peek(System.out::println).map(str->str.salary+10000).collect(Collectors.toList());
        System.out.println( "updated employee salary : "+arrayList);
      ArrayList<Employee> sortedEmployees=(ArrayList<Employee>)  Arrays.stream(arrayOfEmp).sorted(Comparator.comparing(e -> e.name)).collect(Collectors.toList());
        System.out.println(sortedEmployees);
    }


}
