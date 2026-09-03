public class Pendrive {

    private String marca;
    private int capacidadGB;

    public Pendrive(String marca, int capacidadGB) {
        this.marca = marca;
        this.capacidadGB = capacidadGB;
    }

    public void mostrarInformacion() {
        System.out.println("Pendrive: " + marca);
        System.out.println("Capacidad: " + capacidadGB + " GB");
    }
}
