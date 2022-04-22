package be.intecbrussel.eatables;
public class Cone implements Eatable {
    private Flavor []  balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        String ballsString="";
        for (Flavor f : balls) {
            ballsString += f + ", ";
        }
        ballsString = ballsString.substring(0,ballsString.length()-1);
        System.out.println("I am eating a cone with: " + ballsString);
    }

}
