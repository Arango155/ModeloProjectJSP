
package Clases;

public class Alumno {
    private int numero_carne;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private int genero_idgenero;
   

    
    public Alumno(int numero_carne, String nombre, String correo, String telefono, String direccion, int genero_idgenero){
        this.numero_carne=numero_carne;
        this.nombre=nombre;
        this.correo=correo;
        this.telefono=telefono;
        this.direccion=direccion;
        this.genero_idgenero=genero_idgenero;
        
    }

    public int getNumero_carne() {
        return numero_carne;
    }

    public void setNumero_carne(int numero_carne) {
        this.numero_carne = numero_carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getGenero_idgenero() {
        return genero_idgenero;
    }

    public void setGenero_idgenero(int genero_idgenero) {
        this.genero_idgenero = genero_idgenero;
    }

    
    
    
    
}
