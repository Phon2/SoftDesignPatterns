abstract class DoorDecorator implements iDoor{
    protected iDoor door;

    public DoorDecorator(iDoor door) {
        this.door = door;
    }

    @Override
    public String getDescription() {
        return door.getDescription();
    }

    @Override
    public int getHeight() {
        return door.getHeight();
    }

    @Override
    public int getWidth() {
        return door.getWidth();
    }
}
