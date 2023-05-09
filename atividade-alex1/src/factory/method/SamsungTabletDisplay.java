package factory.method;

public class SamsungTabletDisplay implements Display{
    private double inches;
    private String features;

    public SamsungTabletDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display de um Samsung Tab");
        features = getInches() + "\" Tela Touch Display Lcd Samsung";
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    public String toString() {
        return features;
    }
}
