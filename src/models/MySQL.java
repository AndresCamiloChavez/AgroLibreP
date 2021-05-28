
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySQL {
    private static Connection Conexion;
    
    public void MySQLConnection(String usuario, String password , String databaseNombre){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + databaseNombre,usuario, password);
            System.out.println("LOG: Se ha iniciado con exito la cone");
        }catch(ClassNotFoundException | SQLException e){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void closeConnection(){
        try{
            Conexion.close();
            System.out.println("LOG: Se ha finalizado la conexión con el server");
        }catch(SQLException e){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
        }
     
    }
    public int insertData(String nombreTabla,String nombre, String apellido, String email, String password, String telefono){
        int estatus = 0;
        try{
            
            String Query = "INSERT INTO "+ nombreTabla+ " VALUES("
                     + "\"" + nombre + "\", "
                    + "\"" + apellido + "\", "
                    + "\"" + telefono + "\", "
                    + "\"" + email + "\", "
                    + "\"" + password + "\")";
            
            Statement statement = Conexion.createStatement();
            statement.executeUpdate(Query);
            estatus = 1;
        }catch(SQLException e){
             System.out.println("ERRROR = "+ e.toString());
            estatus = 0; // no deberia pasar
            
        }
        return estatus;
    }
    
    public Usuario getUser ( String nombreTabla, String email, String password){
        Usuario usuario = null; // aun no existe
        try{
            String Query = "SELECT * FROM "+nombreTabla;
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while ( resultSet.next()){
                if(resultSet.getString("usu_email").equals(email)){
                    
                    
                    if( resultSet.getString("usu_password").equals(password)){
                        
                        usuario = new Usuario();
                        usuario.setNombre(resultSet.getString("usu_nombre"));
                        usuario.setApellido(resultSet.getString("usu_apellido"));
                        usuario.setPassword(resultSet.getString("usu_password"));
                        usuario.setEmail(resultSet.getString("usu_email"));
                        usuario.setTelefono(resultSet.getString("usu_telefono"));
                        
                    break;
                    }else{
                        System.out.println("Contraseña no coincide");
                        usuario = new Usuario();
                        usuario.setNombre(resultSet.getString("usu_nombre"));
                        usuario.setApellido(resultSet.getString("usu_apellido"));
                        usuario.setPassword(null);
                        usuario.setEmail(resultSet.getString("usu_email"));
                        usuario.setTelefono(resultSet.getString("usu_telefono"));
                        break;
                    }
                      
                }
                
            }
        }catch(SQLException e ){
            //no existe usuario
            System.out.println("ERRROR = "+ e.toString());
            usuario = null;
        }
        return usuario;
    }
    
    public Usuario getUser(String nombreTabla , String email){
        Usuario usuario = null;
        System.out.println("Ingreso datos");
        try{
            String Query = "SELECT * FROM "+nombreTabla;
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while(resultSet.next()){
                if(resultSet.getString("usu_email").equals(email)){
                    usuario = new Usuario();
                    usuario.setNombre(resultSet.getString("usu_nombre"));
                    usuario.setApellido(resultSet.getString("usu_apellido"));
                    usuario.setEmail(resultSet.getString("usu_email"));
                    usuario.setTelefono(resultSet.getString("usu_telefono"));
                    usuario.setPassword(resultSet.getString("usu_password"));
                    break;
                }
            }
        }catch(SQLException e){
            System.out.println("ERRROR = "+ e.toString());
            usuario = null;
        }
        return usuario;
    }
    public static boolean verificarUsuario (String nombreTabla , String primaryKey){
        boolean existe = false;
        
        try{
            String Query = "SELECT * FROM "+nombreTabla;
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while(resultSet.next()){
                if(resultSet.getString("usu_email").equals(primaryKey)){
                  existe = true;
                  break;
                }
            }
        }catch(SQLException e){
            existe  = false;
            System.out.println("Error boolean");
        }
        
        return existe;
    }
    public ArrayList getValues(String nombreTabla){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try{
            String Query = "SELECT * FROM "+ nombreTabla;
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while( resultSet.next()){
                Usuario usuario = new Usuario();
                usuario.setNombre(resultSet.getString("usu_nombre"));
                usuario.setApellido(resultSet.getString("usu_apellido"));
                usuario.setEmail(resultSet.getString("usu_email"));
                usuario.setTelefono(resultSet.getString("usu_telefono"));
                usuario.setPassword(resultSet.getString("usu_password"));
                usuarios.add(usuario);
            }
        }catch(SQLException e){
            usuarios = null;
        }
        return usuarios;
    }
    
    public int updateRecord(String nombreTabla, String email,  String nombre , String apellido, String telefono){
        int estatus = 0;
      
        try{
               String Query = "UPDATE " + nombreTabla + " SET "
                    + "Nombre=\"" + nombre + "\", "
                    + "Apellido=\"" + apellido + "\", "
                    + "Telefno=\"" + telefono + "\" WHERE Email=\"" + email + "\";";
               Statement statement = Conexion.createStatement();
               statement.executeUpdate(Query);
               estatus = 1;
               
        }catch(SQLException e){
            estatus = 0;
        }
            
    return estatus;
    }
    
    
    public int deleteRecord (String nombreTabla, String email){
        int estatus = 0;
        try{
            String Query = "DELETE FROM " + nombreTabla + " WHERE Email = \"" + email + "\"";
            
            Statement statement = Conexion.createStatement();
            statement.executeUpdate(Query);
            estatus = 1;
        }catch(SQLException e){
            estatus = 0;
        }
        return estatus;
    }

}
