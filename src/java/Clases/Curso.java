
package Clases;

public class Curso {
    private int codigo_curso;
    private String nombre;
   

    
    public Curso(int codigo_curso, String nombre){
        this.codigo_curso=codigo_curso;
        this.nombre=nombre;
        
    }

    public int getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(int codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
