package be.intecbrussel.eatables;

public class Magnum implements Eatable {

    private  MagnumType type;

    Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

   
    @Override
    public void eat() {
        System.out.println("Eating Magnum Type:" + type);
    }

    public MagnumType getType() {
        return type;
    }
}
