public class Motorcycle implements Vehicle {
    private final Engine engine;

    public Motorcycle(Engine engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine.getType();
    }

    @Override
    public String VehicleType() {
        return "Motorcycle";
    }

    @Override
    public String WheelAmount() {
        return "2 wheels";
    }

    public String toString() {
        return "This is a " + VehicleType() + " with " + WheelAmount() + " and " + getEngine() + " engine";
    }
}
