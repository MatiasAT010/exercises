public class Main {
    public static void main(String[] args) {
        Vehiculo a1 = new Auto();
        Vehiculo a2 = new Moto();

        a1.arrancar(); // Auto
        a2.arrancar(); // Moto
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
