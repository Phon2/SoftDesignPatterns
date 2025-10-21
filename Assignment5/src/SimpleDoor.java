public class SimpleDoor implements iDoor{

    @Override
    public String getDescription() {
        return "Door";
    }

    @Override
    public int getHeight() {
        return 2;
    }

    @Override
    public int getWidth() {
        return 1;
    }
}
