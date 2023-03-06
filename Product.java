package SeminarsHW.HW1;

public abstract class Product {
    String name;
    Integer price;

    public Product() {
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString() {
        return "\"" + name + "\" стоит: " + price + " руб ";
    }
}
