package factory.method;

public class XiaomiDisplay implements Display{
    private double inches;
    private String features;

    public XiaomiDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public double getInches() {
        return inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para XIAOMI");
        features = getInches() + "\" Full HD 90HZ AMOLED";
    }

    public String toString() {
        return features;
    }
}
