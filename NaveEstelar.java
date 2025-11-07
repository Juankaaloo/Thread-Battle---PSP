public class NaveEstelar implements Runnable {

    private String nombreCivilizacion;
    private int distancia = 0;
    private static final int LIMITE_TIRADAS = 200;

    public NaveEstelar(String nombreCivilizacion) {
        this.nombreCivilizacion = nombreCivilizacion;
    }

    @Override
    public void run() {
        int tiradaLocal = 0;

        while (tiradaLocal < LIMITE_TIRADAS) {
            tiradaLocal++;

            int avance = (int) (Math.random() * 10 + 1); // de 1 a 10 metros
            distancia += avance;

            // Salida EXACTA como la querías
            System.out.println("Nave " + nombreCivilizacion +
                    ": Tirada " + tiradaLocal + " - He avanzado " + distancia + " metros!");

            try {
                Thread.sleep(50); // pausa simulada
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getDistancia() {
        return distancia;
    }

    public String getCivilizacion() {
        return nombreCivilizacion;
    }
}
