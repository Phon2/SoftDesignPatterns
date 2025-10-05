public class Car implements Vehicle {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine.getType();
    }

    @Override
    public String VehicleType() {
        return "Scooter";
    }

    @Override
    public String WheelAmount() {
        return "4 wheels";
    }

    public String toString() {
        return "This is a " + VehicleType() + " with " + WheelAmount() + " and " + getEngine() + " engine";
    }
}
