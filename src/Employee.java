public class Employee extends User{

    public Employee(String id, String username, String password, String email, String phone, FullName fullName, Address address) {
        super(id, username, password, email, phone, fullName, address);
    }

    private String position;
    private float salary;
    private int exp;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
