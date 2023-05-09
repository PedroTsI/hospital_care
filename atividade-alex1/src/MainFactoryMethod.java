import factory.method.*;

public class MainFactoryMethod {

    public static void main(String args[]) {
        DisplayFactory factory = null;

        //Apple
        factory = new AppleDisplayFactory();
        testFactory(factory);

        //Xiaomi
        factory = new XiaomiDisplayFactory();
        testFactory(factory);

        //Samsung
        factory = new SamsungDisplayFactory();
        testFactory(factory);
    }

    private static void testFactory(DisplayFactory factory) {
        Display display;
        FoldableDisplay foldable;

        display = factory.createSmartphoneDisplay(6.1);
        System.out.println(display);
        System.out.println();

        //Create Tablet Display
        display = factory.createTabletDisplay(10.2);
        System.out.println(display);
        System.out.println();

        //Create Foldable Display
        try {
            foldable = factory.createFoldableDisplay(12.3);
            System.out.println(foldable);
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
    }
}
