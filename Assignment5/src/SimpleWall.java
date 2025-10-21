public class SimpleWall implements iWall{
    @Override
    public String getDescription(){
        return "Wall";
    }

    @Override
    public int getHeight() {
        return 3;
    }

    @Override
    public int getWidth() {
        return 10;
    }
}
