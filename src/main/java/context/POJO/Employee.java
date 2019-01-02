package context.POJO;

public class Employee {
    private String name;
    private String country;
    private int age;

    public Employee() {
    }

    public Employee(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
