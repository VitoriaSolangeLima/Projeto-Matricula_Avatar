package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectionFactory {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL_BANCO = "jdbc:mysql://localhost:3306/matriculaaluno20?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USUARIO = "root";
    private static final String SENHA = "Solange123*";
    
    public static Connection getConnection () throws ClassNotFoundException, SQLException {
        //Faz com que a classe seja carregada pela JVM
        Class.forName(DRIVER);
        
        return DriverManager.getConnection(URL_BANCO, USUARIO, SENHA);
    }
    
    public static void closeConnection(Connection con) throws SQLException{
        if(con != null){
            con.close();
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) throws SQLException{
        closeConnection(con);
        if(stmt != null){
            stmt.close();
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) throws SQLException{
        closeConnection(con, stmt);
        if(rs != null){
            rs.close();
        }   
    }
}
