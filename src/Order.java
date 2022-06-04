public class Order {
    private Shipment shipment;
    private Payment payment;
    private Cart cart;


    public Order(Shipment shipment, Payment payment, Cart cart) {
        this.shipment = shipment;
        this.payment = payment;
        this.cart = cart;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
