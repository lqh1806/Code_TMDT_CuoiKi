import java.util.ArrayList;

public class Customer extends User{

    public Customer(String id, String username, String password, String email, String phone, FullName fullName, Address address) {
        super(id, username, password, email, phone, fullName, address);
    }

    private String type;
    private String created;
    private ArrayList<Order> orderList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
}
