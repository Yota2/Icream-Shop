package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

public class IceCreamApp {
    public static void main(String[] args) {

        PriceList pricelist = new PriceList(1.2,1.4,3.4);
        IceCreamSalon icecreamSalon = new IceCreamSalon(pricelist);

        Flavor coneFlavors[] = {Flavor.BANANA, Flavor.MOKKA, Flavor.CHOCOLATE};

        Eatable ijsjes[] = {new Magnum(MagnumType.ROMANTI), new IceRocket(), new Cone(coneFlavors)};
        for(Eatable eatable: ijsjes) {
            eatable.eat();
        }

        icecreamSalon.orderCone(coneFlavors);
        icecreamSalon.orderIceRocket();
        icecreamSalon.orderMagnum(MagnumType.ROMANTI);
        System.out.println(icecreamSalon);
    }
}
