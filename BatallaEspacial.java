public class BatallaEspacial {
    public static void main(String[] args) {
        System.out.println("¡Comienza la Batalla Espacial entre Zorgs y Blips!");

        NaveEstelar naveZorg = new NaveEstelar("Zorg");
        NaveEstelar naveBlip = new NaveEstelar("Blip");

        Thread t1 = new Thread(naveZorg);
        Thread t2 = new Thread(naveBlip);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nBatalla espacial concluida.");
        if (naveZorg.getDistancia() > naveBlip.getDistancia()) {
            System.out.println("Esta batalla la ha ganado la civilización " + naveZorg.getCivilizacion());
        } else if (naveBlip.getDistancia() > naveZorg.getDistancia()) {
            System.out.println("Esta batalla la ha ganado la civilización " + naveBlip.getCivilizacion());
        } else {
            System.out.println("¡Empate cósmico!");
        }
    }
}
