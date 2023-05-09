package factory.method;

public class SamsungDisplay implements Display {
    private double inches;
    private String features;

    public SamsungDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public double getInches() {
        return inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para Samsung");
        features = getInches() + "\" Full HD 90HZ";
    }

    public String toString() {
        return features;
    }
}
