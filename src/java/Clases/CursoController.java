
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JP
 */
public class CursoController {
      Curso[] tablaCurso;
    int indiceArray;
    private ConexionBaseDeDatos conectorBD;
    private Connection conexion;
    private PreparedStatement statement = null;
    private ResultSet result = null;
    
    public CursoController(){
        this.tablaCurso = new Curso[100];
        this.indiceArray=0;
    }
    
     public void guardarCurso(Curso curso){
        this.tablaCurso[this.indiceArray]=curso;  
        this.indiceArray=this.indiceArray+1;
        // procedimiento para almacenar en la Base de Datos
    }
    
    public Curso[] getCurso(){
        return this.tablaCurso;
    }
    
    public void abrirConexion(){
        conectorBD= new ConexionBaseDeDatos();
        conexion=conectorBD.conectar();
    }
    
    public boolean getCurso2(Curso curso){        
        String sql = "INSERT INTO universidad.curso(codigo_curso, nombre) ";
             sql += " VALUES(?,?)"; 
        try{
            abrirConexion();
            statement = conexion.prepareStatement(sql); 
            statement.setInt(1, curso.getCodigo_curso());
            statement.setString(2, curso.getNombre());
           
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

