package Abstract;

public class WoodenDoorFactory implements DoorFactory {
    public Door makeDoor() {
        return new WoodenDoor();
    }

    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}
