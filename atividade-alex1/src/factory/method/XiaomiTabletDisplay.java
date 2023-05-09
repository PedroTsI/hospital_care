package factory.method;

public class XiaomiTabletDisplay implements Display{
    private double inches;
    private String features;

    public XiaomiTabletDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um Tablet Xiaomi");
        features = getInches() + "\" Tela Touch Display Lcd Xiaomi";
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    public String toString() {
        return features;
    }
}
