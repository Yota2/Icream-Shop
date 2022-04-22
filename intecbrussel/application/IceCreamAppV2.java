package be.intecbrussel.application;
import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {


        // creating iceRockets and cons balls and ma
        Stock stock = new Stock(1,4,4,3);
        PriceList pricelist2 = new PriceList(1.2,1.4,3.4);
        Flavor coneFlavors[] = {Flavor.BANANA, Flavor.MOKKA, Flavor.CHOCOLATE , Flavor.MOKKA};
        Eatable ijsjes[] = {new Magnum(MagnumType.ROMANTI), new IceRocket(), new Cone(coneFlavors)};
        IceCreamCar icecreamCar = new IceCreamCar(pricelist2,stock);

        try {
            icecreamCar.orderCone(coneFlavors);
            icecreamCar.orderMagnum(MagnumType.ALPINENUTS);
            icecreamCar.orderMagnum(MagnumType.ALPINENUTS);
            System.out.println(icecreamCar.getProfit());
            icecreamCar.orderMagnum(MagnumType.ALPINENUTS);
        } catch (NoMoreIceCreamException e) {
            e.printStackTrace();
        }

    }
}
