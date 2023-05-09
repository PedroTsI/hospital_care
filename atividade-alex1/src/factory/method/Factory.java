package factory.method;

import java.util.concurrent.TimeUnit;

public interface Factory {
    public Display createDisplay();
    public Display createTabletDisplay();
    public FoldableDisplay createFoldableDisplay();
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
}
