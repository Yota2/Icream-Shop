package be.intecbrussel.sellers;
import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon() {
    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Flavor[] flavor) {
        double ballPrice = priceList.getBallPrice();
        this.totalProfit += ballPrice * flavor.length;
        return new Cone(flavor);
    }

    @Override
    public IceRocket orderIceRocket() {
        this.totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        this.totalProfit += priceList.getMagnumStandardPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return this.totalProfit;
    }

    @Override
    public String toString() {
        return "De totale prijs is: €" + this.totalProfit;
    }
}
