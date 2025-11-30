package model.dao;

import conection.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Aluno;

public class AlunoDAO {
   public void create (Aluno a) throws ClassNotFoundException, SQLException {
       
       Connection con = ConectionFactory.getConnection();
       PreparedStatement stmt = null;
       
       stmt = con.prepareStatement("INSERT INTO Aluno(nomealuno, cpfaluno, data_nascimento,email_aluno,nomesocial_aluno,deficiente,tipo_deficiencia,enderecoaluno,telefonealuno,nomeresponsavel,cpfresponsavel,telefoneresponsavel)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
       stmt.setString(1,a.getNomealuno());
       stmt.setString(2, a.getCpfaluno());
       stmt.setDate(3, new java.sql.Date(a.getData_nascimento().getTime()));
       stmt.setString(4, a.getEmail_aluno());
       stmt.setString(5, a.getNomesocial_aluno());
       stmt.setBoolean(6, a.isDeficiente());
       stmt.setString(7, a.getTipo_deficiencia());
       stmt.setString(8, a.getEnderecoaluno());
       stmt.setString(9, a.getTelefonealuno());
       stmt.setString(10, a.getNomeresponsavel() );
       stmt.setString(11, a.getCpfresponsavel());
       stmt.setString(12, a.getTelefoneresponsavel());
       
       //Prepara e executa o sql
        stmt.executeUpdate();
        //Fecha a conexão 
        ConectionFactory.closeConnection(con, stmt);
   }
}
