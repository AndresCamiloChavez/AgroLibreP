
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
    
    public int inserDataProducto(String nombreTabla , String nombreProducto, double precio, String descripcion , String cantidad, String codigo, String email ){
    
    int estatus = 0;
        try{
            
            String Query = "INSERT INTO "+ nombreTabla+ " VALUES("
                     + "\"" + codigo + "\", "
                    + "\"" + nombreProducto + "\", "
                    + "\"" + precio + "\", "
                    + "\"" + descripcion + "\", "
                    + "\"" + cantidad+ "\", "
                    + "\"" + email+ "\")";
            
            Statement statement = Conexion.createStatement();
            statement.executeUpdate(Query);
            estatus = 1;
        }catch(SQLException e){
             System.out.println("ERRROR insert  = "+ e.toString());
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
      //  System.out.println("Ingreso datos");
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
    
    public Producto getProducto (String nombreTabla, String codigo){
        Producto producto = null;
      //  System.out.println("Ingreso datos");
        try{
            String Query = "SELECT * FROM "+nombreTabla;
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while(resultSet.next()){
                if(resultSet.getString("pro_codigo").equals(codigo)){
                    producto = new Producto();
                    producto.setNombreProducto(resultSet.getString("pro_nombre"));
                    producto.setDescripcion(resultSet.getString("pro_descripcion"));
                    producto.setPrecio(resultSet.getDouble("pro_precio"));
                    producto.setCantidad(resultSet.getString("pro_cantidad"));
              
                    break;
                }
            }
        }catch(SQLException e){
            System.out.println("ERRROR = "+ e.toString());
            producto = null;
        }
        return producto;
    }
    public boolean verificarUsuario (String nombreTabla , String primaryKey){
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
    
    public boolean verificarProducto(String nombreTabla , String codigo){
        boolean existe = false;
        
        try{
            String Query = "SELECT * FROM "+nombreTabla;
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while(resultSet.next()){
                if(resultSet.getString("pro_codigo").equals(codigo)){
                  existe = true;
                  break;
                }
            }
        }catch(SQLException e){
            existe  = false;
            System.out.println("Error boolean producto ");
        }
        
        return existe;
    }
    public boolean verificarProductoUsuario(String nombreTabla , String codigo, String email){
        boolean existe = false;
        
        try{
            String Query = "SELECT * FROM "+nombreTabla+" WHERE pro_codigo = '"+codigo+"' AND pro_email = '"+ email+"'; ";
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while(resultSet.next()){
                if(resultSet.getString("pro_codigo").equals(codigo) && resultSet.getString("pro_email").equals(email)){
                  existe = true;
                  break;
                }
            }
        }catch(SQLException e){
            existe  = false;
            System.out.println("Error boolean producto ");
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
    
    
    public ArrayList getListProducto (String nombreTabla , String email){
        ArrayList<Producto> productos = new ArrayList<>();
        
        try{
            String Query = "SELECT * FROM "+ nombreTabla+" WHERE " + "pro_email = '"+ email+"';";
            System.out.println("print email "+ email);
            System.out.println("query 222 "+ Query);
          
                    
            Statement statement = Conexion.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(Query);
            
            while( resultSet.next()){
                Producto producto = new Producto();
                producto.setCodigo(resultSet.getString("pro_codigo"));
                producto.setNombreProducto(resultSet.getString("pro_nombre"));
                producto.setPrecio(resultSet.getDouble("pro_precio"));
                producto.setDescripcion(resultSet.getString("pro_descripcion"));
                producto.setCantidad(resultSet.getString("pro_cantidad"));
                productos.add(producto);
            }
        }catch(SQLException e){
            System.out.println("error lis my"+ e.toString());
            productos = null;
        }
        
        
        return productos;
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
    public int deleteProducto (String nombreTabla, String codigo, String email){
        int estatus = 0;
        
        try{
            String Query = "DELETE FROM " + nombreTabla + " WHERE pro_codigo = '" + codigo + "' AND pro_email = '"+ email +"';";
            System.out.println(Query);
            Statement statement = Conexion.createStatement();
            statement.executeUpdate(Query);
            estatus = 1;
        }catch(SQLException e){
            estatus = 0;
            System.out.println("delete producto "+ e.toString());
        }
        return estatus;
        
    }
    public int updateContraseña (String nombreTabla, String email , String password){
        
        
        int estatus = 0;
      
        try{
               String Query = "UPDATE " + nombreTabla + " SET "
                    + "usu_password=\"" + password + "\" WHERE usu_email=\"" + email + "\";";
               Statement statement = Conexion.createStatement();
               statement.executeUpdate(Query);
               estatus = 1;
               
        }catch(SQLException e){
            System.out.println("EError update contraseña "+ e.toString());
            estatus = 0;
        }
            
    return estatus;
    }
    
    public int updateProducto(String nombreTabla, String nombre, String codigo, String email, double precio, String cantidad,String descripcion){
           
        int estatus = 0;

        try{
               String Query = "UPDATE " + nombreTabla + " SET "
                    + "pro_nombre=\"" + nombre + "\", "
                    + "pro_precio=\"" + precio + "\", "
                    + "pro_descripcion=\"" + descripcion + "\", "
                    + "pro_cantidad=\"" + cantidad + "\" WHERE pro_codigo = '" + codigo + "' AND pro_email = '"+ email+"';";
               Statement statement = Conexion.createStatement();
               statement.executeUpdate(Query);
               estatus = 1;
             //  System.out.println("---------------- "+ Query);

        }catch(SQLException e){
            System.out.println("error acutalizar producto " + e.toString());
            
            //System.out.println("descripcion " + descripcion);
            estatus = 0;
        }
            
    return estatus;
    }
    

}
