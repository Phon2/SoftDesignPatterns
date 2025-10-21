public class HouseImplementation implements iHouse{
    iWall houseWall;
    iDoor houseDoor;
    int wallNumber;
    int doorNumber;

    public HouseImplementation(iWall wall,int wallNumber,iDoor door,int doorNumber){
        this.houseWall = wall;
        this.wallNumber = wallNumber;
        this.houseDoor = door;
        this.doorNumber = doorNumber;
    }

    @Override
    public String getAllElements() {
        return wallNumber + " walls and " + doorNumber + " doors";
    }

    @Override
    public String getAmountOfPaint() {
        return (wallNumber * houseWall.getHeight() * houseWall.getWidth()
         - doorNumber * houseDoor.getHeight() * houseDoor.getWidth()) + "m^2 of paint to paint";
    }
}
