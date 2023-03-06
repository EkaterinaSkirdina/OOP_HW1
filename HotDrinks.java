package SeminarsHW.HW1;

public class HotDrinks extends Drinks {
    private Integer temp;

    public HotDrinks(String name, Integer price, Double volume, Integer temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}
