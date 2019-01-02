package context.POJO;

public class Company {
    private Employee employee;
    private Address address;

    public Company() {
    }

    public Company(Employee employee, Address address) {
        this.employee = employee;
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employee=" + employee +
                ", address=" + address +
                '}';
    }
}
