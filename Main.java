package SeminarsHW.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottle vmb = new VendingMachineBottle();
        List<BottleWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleWater("Cola", 150, 0.5),
                new BottleWater("Sprite", 150, 0.5),
                new BottleWater("Fanta", 150, 0.5),
                new BottleWater("Bon-Aqua", 100, 0.5)));
        vmb.initProduct(bottleList);
        System.out.println(vmb.getProduct("Cola"));

        System.out.println("--------- ГОРЯЧИЕ НАПИТКИ ---------");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", 200, 0.3, 90),
                new HotDrinks("Tea", 100, 0.3, 90),
                new HotDrinks("Cacao", 150, 0.4, 70),
                new HotDrinks("Milk", 100, 0.5, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по параметрам: " + vmHotDrinks.getProduct("Tea", 0.3, 90));

    }

}