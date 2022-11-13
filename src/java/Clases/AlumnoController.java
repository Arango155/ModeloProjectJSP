
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JP
 */
public class AlumnoController {
      Alumno[] tablaAlumno;
    int indiceArray;
    private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public AlumnoController(){
        this.tablaAlumno = new Alumno[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno(Alumno alumno){
        this.tablaAlumno[this.indiceArray]=alumno;  
        this.indiceArray=this.indiceArray+1;
        // procedimiento para almacenar en la Base de Datos
    }
    
    public Alumno[] getAlumno(){
        return this.tablaAlumno;
    }
    
    public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }
    
    public boolean getAlumno2(Alumno alumno){        
        String sql = "INSERT INTO universidad.alumno(numero_carne, nombre, correo, telefono, direccion, genero_idgenero) ";
             sql += " VALUES(?,?,?,?,?,?)"; 
        try{
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, alumno.getNumero_carne());
            statement.setString(2, alumno.getNombre());
            statement.setString(3, alumno.getCorreo());
            statement.setString(4, alumno.getTelefono());
            statement.setString(5, alumno.getDireccion());
            statement.setInt(6, alumno.getGenero_idgenero());
             int resultado = statement.executeUpdate(); 
                if(resultado > 0){
                    return true;
                }else{
                    return false;
                }
        }catch(SQLException e){
            String error = e.getMessage();  
            return false;
        }    
    }
    
     
    
    
    
}

