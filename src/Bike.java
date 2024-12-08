public class Bike implements Vehicule{

    @Override
    public void start() {
    System.out.println("Bike started in " + this.startLocation);
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped in " + this.endLocation);

    }
}
