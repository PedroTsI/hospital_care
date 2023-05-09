package factory.method;

import java.util.concurrent.TimeUnit;

public interface DisplayFactory {
    public Display createSmartphoneDisplay(double inches);
    public Display createTabletDisplay(double inches);
    public FoldableDisplay createFoldableDisplay(double inches) throws Exception; //Adicionado lançamento de exceção para fábricas que não produzem desse tipo.

    public default void qualityTest(Display display) {
        System.out.print("Teste de Qualidade: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" OK (passed) | Display :" + display.getInches());
    }

    public default void qualityFoldable(FoldableDisplay display) {
        System.out.print("Teste de Qualidade Dobrável: ");
        for (int i = 1; i < 4; i++) {
            System.out.print(  "[*] ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        display.fold();
        System.out.println(" OK (passed) | Display :" + display.getInches());
    }
}
