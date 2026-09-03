public class Main {

    public static void main(String[] args) {

        // El pendrive se crea independientemente
        Pendrive miPendrive = new Pendrive("Kingston", 64);

        // Creamos la PC
        PC miPC = new PC("Lenovo");

        // Conectamos el pendrive a la PC
        miPC.conectarPendrive(miPendrive);

        // Mostramos la información
        miPC.mostrarPendrive();
    }
}