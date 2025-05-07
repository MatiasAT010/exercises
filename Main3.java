public class Main3 {
    public static void main(String[] args) {
        CorreoNotificador notificador = new CorreoNotificador();
        RegistroUsuario registro = new RegistroUsuario(notificador);

        registro.registrar("Mati", "Mati@gmail.com");

        ReporteUsuarios reporte = new ReporteUsuarios();
        reporte.generar();
    }
}

class RegistroUsuario {
    private CorreoNotificador notificador;

    public RegistroUsuario(CorreoNotificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nombre, String correo) {
        System.out.println("Registrando usuario: " + nombre);
        notificador.enviarCorreo(correo);
    }
}

class CorreoNotificador {
    public void enviarCorreo(String correo) {
        System.out.println("Enviando correo de bienvenida a: " + correo);
    }
}

class ReporteUsuarios {
    public void generar() {
        System.out.println("Haciendo reporte de usuarios...");
    }
}
