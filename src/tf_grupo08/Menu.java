package tf_grupo08;

public class Menu {

    private String tamaño;
    private String masa;
    private String queso;
    private String salsa;
    private String ingredientes;

    public Menu() {
    }

    public Menu(String tamaño, String masa, String queso, String salsa, String ingredientes) {
        this.tamaño = tamaño;
        this.masa = masa;
        this.queso = queso;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

}
