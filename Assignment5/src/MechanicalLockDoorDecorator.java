public class MechanicalLockDoorDecorator extends DoorDecorator{
    public MechanicalLockDoorDecorator(iDoor door) {
        super(door);
    }

    public String getDescription(){
        return door.getDescription() + " with Mechanical Lock";
    }
}
