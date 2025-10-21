public class WoodenWallDecorator extends WallDecorator {

    public WoodenWallDecorator(iWall wall) {
        super(wall);
    }

    public String getDescription() {
        return "Wooden " + wall.getDescription();
    }
}
