package tf_grupo08;
public class Usuario {
    private int dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;
    private String nUsuario;

    public Usuario(int dni, String nombre, String apellido, String domicilio, String telefono, String nUsuario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.nUsuario = nUsuario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }
    
    //Método
        public void saludarUsuario() {
            System.out.println("Bienvenido a Pizzeria Mix&Try");
}
    //Método    
        public void verificarNombre(){
        
        
        
        }
}
