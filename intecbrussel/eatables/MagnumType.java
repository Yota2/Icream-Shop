package be.intecbrussel.eatables;

public enum MagnumType {
    MILKCHOCOLATE(1) ,
    WHITECHOCOLATE(1),
    BLACKCHOCOLATE(1),
    ALPINENUTS  (1.5),
    ROMANTI(1),
    STRAWBERRIES(1);

    double magnumPrice;
    MagnumType(double magnumPrice) {
        this.magnumPrice= magnumPrice;
    }

    public double getMagnumPrice() {
        return magnumPrice;
    }

}
