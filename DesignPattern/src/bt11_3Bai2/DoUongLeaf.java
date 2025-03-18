package bt11_3Bai2;

public class DoUongLeaf implements Composite{
    private String name;
    private double price;

    public DoUongLeaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double totalPrice() {
        return this.price;
    }
}