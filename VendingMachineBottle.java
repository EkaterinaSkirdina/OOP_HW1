package SeminarsHW.HW1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottle implements VendingMachine {
    List<BottleWater> bottleWaterList = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<BottleWater> bottle) {
        this.bottleWaterList = bottle;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        for (BottleWater el : bottleWaterList) {
            if (el.getName().equals(name))
                return el.toString();
        }
        return "Не найдено";
    }
}