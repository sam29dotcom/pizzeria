package tf_grupo08;

import java.util.Scanner;

//Declarando atributos
public class Usuario {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String nUsuario;

//Constructor con parámetros
    public Usuario(String dni, String nombre, String apellido, String telefono, String nUsuario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nUsuario = nUsuario;
    }
    //Getters and Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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
            Scanner entrada = new Scanner(System.in);
            String nombreIngresado;
            boolean valido = false;
            String regex = "^[A-Z][a-z]+$";

            do{
            System.out.println("Ingrese su nombre (ej: Tomas");
            nombreIngresado = entrada.nextLine();
            
            //Verificación del nombre
            if (nombreIngresado.matches(regex)){
                this.nombre = nombreIngresado;
                System.out.println("Nombre ingresado: " + nombreIngresado);
                valido = true;
                
            }else{
                System.out.println("Ingrese nuevamente su nombre. Debe comenzar con mayúscula");
            }
            } while (!valido);
        }
        //Método     
        public void verificarDni(){
            Scanner entrada = new Scanner(System.in);
            String dniIngresado;
            boolean valido = false;
            String regex = "^\\d{7}$";
            
            do{
            System.out.println("Ingrese su DNI: ");
            dniIngresado = entrada.nextLine();
      
            //Verificación de DNI
            if (dniIngresado.matches(regex)){
                this.dni = dniIngresado;
                System.out.println("DNI ingresado: " + dniIngresado);
                valido = true;
                
            }else{
                System.out.println("Ingrese un DNI válido");
            }
            }while (!valido);
            
            }
        }
      
