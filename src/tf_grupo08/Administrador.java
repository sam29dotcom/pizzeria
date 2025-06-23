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
//Método #1  
        public void crearNumAdmin(){
            String adminNombre = (this.nombre).substring(0,1);
            String adminApellido = (this.apellido).substring(0,1);
            String adminDni = (this.dni).substring((this.dni).length()-3);
            this.num_admin = "AD"+(adminNombre+adminApellido+adminDni).toUpperCase();      
    }
//Método #2
        public void crearPassword(){
        
        
        }
    
    
    
    
    
}
