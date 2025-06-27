package tf_grupo08;

public class TF_Grupo08 {

    public static void main(String[] args) {
        // Crear un objeto de tipo Usuario
        Usuario oUsuario = new Usuario();

        // CORREGIDO: Ahora solo llamamos a los métodos una vez (sin duplicación)
        oUsuario.verificarNombre();     // Solicitar nombre
        oUsuario.verificarApellido();   // Solicitar apellido
        oUsuario.verificarDni();        // Solicitar DNI
        oUsuario.solicitarTelefono();   // Solicitar teléfono
        oUsuario.registroUsuario();     // Finalizar registro (sin duplicar datos)

        // Crear un objeto de tipo Menu
        Menu oMenu = new Menu();

        // Ejecutar el proceso completo de selección de pizza
        oMenu.procesarPedido();
    }
}
