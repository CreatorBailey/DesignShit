package Abstract;

public class main {
    public static void main(String[] args) {

        WoodenDoorFactory woodenFactory = new WoodenDoorFactory();

        Door a = woodenFactory.makeDoor();
        DoorFittingExpert b = woodenFactory.makeFittingExpert();

        a.getDescription();
        b.getDescription();

        IronDoorFactory ironFactory = new IronDoorFactory();
        Door c = ironFactory.makeDoor();
        DoorFittingExpert d = ironFactory.makeFittingExpert();

        c.getDescription();
        d.getDescription();

    }
}
