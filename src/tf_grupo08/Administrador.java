package tf_grupo08;

public class Administrador extends Usuario {

    private String num_admin;
    private String cod_admin;
    private String password_admin;

//Constructor con herencia   
    public Administrador(String num_admin, String cod_admin, String password_admin, String dni, String nombre, String apellido, String telefono) {
        super(dni, nombre, apellido, telefono);
        this.num_admin = num_admin;
        this.cod_admin = cod_admin;
        this.password_admin = password_admin;
    }
//Getters and setters

    public String getNum_admin() {
        return num_admin;
    }

    public void setNum_admin(String num_admin) {
        this.num_admin = num_admin;
    }

    public String getCod_admin() {
        return cod_admin;
    }

    public void setCod_admin(String cod_admin) {
        this.cod_admin = cod_admin;
    }

    public String getPassword_admin() {
        return password_admin;
    }

    public void setPassword_admin(String password_admin) {
        this.password_admin = password_admin;
    }
//Método #1 - CORREGIDO: Ahora usa getters en lugar de acceso directo

    public void crearNumAdmin() {
        // CORREGIDO: Usando getNombre() en lugar de this.nombre
        String adminNombre = (this.getNombre()).substring(0, 1);
        // CORREGIDO: Usando getApellido() en lugar de this.apellido
        String adminApellido = (this.getApellido()).substring(0, 1);
        // CORREGIDO: Usando getDni() en lugar de this.dni
        String adminDni = (this.getDni()).substring((this.getDni()).length() - 3);
        this.num_admin = "AD" + (adminNombre + adminApellido + adminDni).toUpperCase();
    }
//Método #2

    public void crearPassword() {
        // Este método aún está vacío - será el siguiente error por corregir
    }

}
