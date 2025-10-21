public class WhiteWallDecorator extends WallDecorator {
    public WhiteWallDecorator(iWall wall) {
        super(wall);
    }

    public String getDescription() {
        return "White " + wall.getDescription();
    }
}
