public class RedWallDecorator extends WallDecorator {
    public RedWallDecorator(iWall wall) {
        super(wall);
    }

    public String getDescription() {
        return "Red " + wall.getDescription();
    }
}
