public class Main {
    public static void main(String[] args) {
        Vehicle DiselCar = new Car(new DiselEngine());
        Vehicle ElectricScooter = new Scooter(new ElectricEngine());
        Vehicle DiselMotorcycle = new Motorcycle(new DiselEngine());

        System.out.println(DiselCar.toString());
        System.out.println(ElectricScooter.toString());
        System.out.println(DiselMotorcycle.toString());

    }
}