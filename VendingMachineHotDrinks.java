package SeminarsHW.HW1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name, Double volume, Integer temp) {
        for (HotDrinks el : hotDrinksList) {
            if ((el.getName().equals(name)) &&
                    (el.getVolume().equals(volume)) &&
                    (el.getTemp().equals(temp))) {
                return el.toString();
            }
        }
        return "Не найдено";
    }
}
