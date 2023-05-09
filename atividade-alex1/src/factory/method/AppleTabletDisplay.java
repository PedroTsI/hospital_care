package factory.method;

public class AppleTabletDisplay implements Display{
    private double inches;
    private String features;

    public AppleTabletDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um Ipad");
        features = getInches() + "\" Liquid Retina Display 2388 x 1668 pixels resolution for iPad PRO Antireflective";
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    public String toString() {
        return features;
    }
}
