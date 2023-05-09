package factory.method;

public class SamsungFoldableDisplay implements FoldableDisplay{
    private double inches;
    private String features;

    public SamsungFoldableDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    @Override
    public void fold() {
        System.out.println("Dobrando tela da Samsung");
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display Dobrável da Samsung");
        features = getInches() + "\" Tela Dobrável de alta resolução da Samsung";
    }

    public String toString() {
        return this.features;
    }
}
