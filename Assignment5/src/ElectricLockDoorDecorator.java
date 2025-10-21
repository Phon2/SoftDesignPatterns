public class ElectricLockDoorDecorator extends DoorDecorator{
    public ElectricLockDoorDecorator(iDoor door) {
        super(door);
    }

    public String getDescription(){
        return door.getDescription() + " with Electric Lock";
    }
}
