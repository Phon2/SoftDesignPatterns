//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        iWall wall = new WhiteWallDecorator(new ConcreteWallDecorator(new WoodenWallDecorator(new SimpleWall())));
        iDoor door = new ElectricLockDoorDecorator(new SimpleDoor());

        System.out.println(wall.getDescription());
        System.out.println(door.getDescription());

        iHouse house_first = new HouseImplementation(wall, 4, door, 1);
        iHouse house_bigger = new HouseImplementation(wall, 10, door, 3);

        System.out.println("house_first will take " + house_first.getAmountOfPaint()
        + " with " + house_first.getAllElements());
        System.out.println("house_bigger will take " + house_bigger.getAmountOfPaint()
        + " with " + house_bigger.getAllElements());

    }
}