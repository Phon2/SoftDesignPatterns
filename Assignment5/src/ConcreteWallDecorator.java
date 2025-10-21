public class ConcreteWallDecorator extends WallDecorator {
    public ConcreteWallDecorator(iWall wall) {
        super(wall);
    }

    public String getDescription() {
        return "Concrete " + wall.getDescription();
    }
}
