
package DAO;

import DTO.RegisterDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class RegisterDAO {

    public static boolean next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    Connection conn;
    PreparedStatement pstm;
    //criando metodo
    public void cadastrarFuncionario(RegisterDTO objfuncionariodto){
        //identifando nomes da tabela e colunas e adcionando valor
        String sql = "insert into usuario (nome_usuario, senha_usuario) values (?,?);";
        
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getSenha());
      
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "RegistarDao" + erro);
        }
    }
}
