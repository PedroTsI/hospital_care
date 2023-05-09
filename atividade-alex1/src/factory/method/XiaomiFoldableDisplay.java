package factory.method;

public class XiaomiFoldableDisplay implements FoldableDisplay{
    private double inches;
    private String features;

    public XiaomiFoldableDisplay(double inches) {
        this.inches = inches;
    }

    @Override
    public double getInches() {
        return this.inches;
    }

    @Override
    public void fold() {
        System.out.println("Dobrando tela da Xiaomi");
    }

    @Override
    public void assemble() {
        System.out.println("Montando o display Dobrável da Xiaomi");
        features = getInches() + "\" Tela Dobrável de alta resolução da Xiaomi";
    }

    public String toString() {
        return this.features;
    }
}
