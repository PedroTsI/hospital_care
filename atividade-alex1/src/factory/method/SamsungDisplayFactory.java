package factory.method;

public class SamsungDisplayFactory implements DisplayFactory{
    @Override
    public Display createSmartphoneDisplay(double inches) {
        Display display = new SamsungDisplay(inches);
        display.assemble();
        qualityTest(display);
        return display;
    }

    @Override
    public Display createTabletDisplay(double inches) {
        Display display = new SamsungTabletDisplay(inches);
        display.assemble();
        qualityTest(display);
        return display;
    }

    @Override
    public FoldableDisplay createFoldableDisplay(double inches) throws Exception {
        FoldableDisplay foldable = new SamsungFoldableDisplay(inches);
        foldable.assemble();
        qualityFoldable(foldable);
        return foldable;
    }
}
