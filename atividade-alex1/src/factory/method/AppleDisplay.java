package factory.method;

public class AppleDisplay implements Display{
    private double inches;
    private String features;

    public AppleDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public double getInches() {
        return inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando display para Iphone");
        features = getInches() + "\" Super Retina XDR OLED Display 2532 X 1170 pixels resolution for iPhone 14";
    }

    public String toString() {
        return features;
    }
}
