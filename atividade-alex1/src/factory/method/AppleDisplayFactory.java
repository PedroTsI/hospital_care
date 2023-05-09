package factory.method;

public class AppleDisplayFactory implements DisplayFactory{
    @Override
    public Display createSmartphoneDisplay(double inches) {
        Display display = new AppleDisplay(inches);
        display.assemble();
        qualityTest(display);
        return display;
    }

    @Override
    public Display createTabletDisplay(double inches) {
        Display display = new AppleTabletDisplay(inches);
        display.assemble();
        qualityTest(display);
        return display;
    }

    @Override
    public FoldableDisplay createFoldableDisplay(double inches) throws Exception{
        throw new Exception("A apple não tem aparelhos com tela Dobrável");
    }
}
