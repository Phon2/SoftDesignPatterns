abstract class WallDecorator implements iWall{
    protected iWall wall;

    public WallDecorator(iWall wall) {
        this.wall = wall;
    }

    @Override
    public String getDescription() {
        return wall.getDescription();
    }

    @Override
    public int getHeight() {
        return wall.getHeight();
    }

    @Override
    public int getWidth() {
        return wall.getWidth();
    }
}
