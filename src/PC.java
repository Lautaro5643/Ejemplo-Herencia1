public class PC {

    private String marca;
    private Pendrive pendrive;

    public PC(String marca) {
        this.marca = marca;
    }

    public void conectarPendrive(Pendrive pendrive) {
        this.pendrive = pendrive;
    }

    public void mostrarPendrive() {
        System.out.println("PC: " + marca);

        if (pendrive != null) {
            pendrive.mostrarInformacion();
        } else {
            System.out.println("No hay ningún pendrive conectado.");
        }
    }
}
