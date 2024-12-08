public class Car implements Vehicule{

    @Override
    public void start() {
    System.out.println("Car started in " + this.startLocation);
    }

    @Override
    public void stop() {
        System.out.println("Car stopped in " + this.endLocation);

    }
}
