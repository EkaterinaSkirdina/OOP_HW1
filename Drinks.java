package SeminarsHW.HW1;

public class Drinks extends Product {
    private Double volume;

    public Drinks(String name, Integer price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }
}
