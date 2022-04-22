package be.intecbrussel.sellers;
import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }


    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }


    @Override
    public Cone orderCone(Flavor[] flavor) throws NoMoreIceCreamException {
        double ballPrice = priceList.getBallPrice();
        int stockBalls = stock.getBalls();
        int stockCone = stock.getCones();
        if(stockBalls>flavor.length && stockCone >0 ) {
            this.profit += ballPrice * flavor.length;
            stock.setBalls(--stockBalls);
            stock.setCones(--stockCone);
        }
        if(stockBalls<flavor.length && stockCone == 0) {
            throw new NoMoreIceCreamException("No more flavor and cones in stock");
        }
        if(stockBalls<flavor.length) {
            throw new NoMoreIceCreamException("No more flavor in stock");
        }
        if(stock.getCones()<=0) {
            throw new NoMoreIceCreamException("No more cones in stock");
        }
        return new Cone(flavor);
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        int stockIceRocket = stock.getIceRockets();
        if(stockIceRocket>0) {
            this.profit += priceList.getRocketPrice();
            stock.setIceRockets(--stockIceRocket);
        } else {
            throw new NoMoreIceCreamException("No more Ice Rocket in stock");
        }
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException {
        int stockMagnum = stock.getMagni();
        if(stockMagnum>0) {
            this.profit += priceList.getMagnumStandardPrice(magnumType);
            stock.setMagni(--stockMagnum);
        } else {
            throw new NoMoreIceCreamException("No more Magnum in stock");
        }
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return this.profit;
    }
}
