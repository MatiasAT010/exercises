public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Auto();
        Vehiculo v2 = new Moto();

        v1.arrancar(); // Auto
        v2.arrancar(); // Moto
    }
}

class Vehiculo {
    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }
}

class Auto extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("El auto arranca con llave.");
    }
}

class Moto extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("La moto arranca con botón.");
    }
}
