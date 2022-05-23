package HT7_constructorReference;

import java.util.function.BiFunction;

public class Employee {
    String name;
    int salary;
    int account;

    public Employee(String name, int salary, int account) {
        this.name = name;
        this.salary = salary;
        this.account = account;
    }

    public Employee() {
        //default constructor
    }

    static int methodReference(int a, int b) {
        return a + b;
    }

    int instanceMethod(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", account=" + account +
                '}';
    }

    public static void main(String[] args) {

        //user defined functional interface method reference static
        EmployeeFunctionalInterfaceMethodReference reference = Employee::methodReference;
        System.out.println("static method reference output using user defined functional interfaces " + reference.sum(2, 4));

        //predefined functional interface method reference static
        BiFunction<Integer, Integer, Integer> addOutput = Employee::methodReference;
        System.out.println("static method reference output using predefined functional interfaces " + addOutput.apply(4, 5));

        //instance method reference
        Employee employee = new Employee();
        EmployeeFunctionalInterfaceMethodReference reference1 = employee::instanceMethod;
        System.out.println("non static method reference output using user defined functional interfaces" + reference1.sum(7, 8));

        //constructor reference
        //program to get the details of Employee Object , such as name, account, salary , where Employee class has parameterized constructor using constructor reference
        EmployeeFunctionalInterfaceConstructorReference constructorReference = Employee::new;
        Employee employee1 = constructorReference.getEmployee("Prince", 1234, 4321);
        System.out.println("employee printed with Constructr Reference reference " + employee1);
    }
}
