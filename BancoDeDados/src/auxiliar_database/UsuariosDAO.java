package auxiliar_database;

import Model.Usuario;
import utilities.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {
    private Connection connection;
    public UsuariosDAO (String myConnection){
        try {
            connection = DriverManager.getConnection(myConnection);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
            connection = null;
        }
    }
    public boolean insertUsuario (Usuario user){
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(Constants.getInsert(Constants.TABELA_USUARIO,4));
            statement.setString(2,user.nome);
            statement.setString(3,user.email);
            statement.setString(4,user.senha);
            statement.setNull(1,Types.INTEGER);

            statement.executeUpdate();
            connection.commit();

        } catch (Exception e ) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Usuario> getAllUsuario(){
        List<Usuario> users = new ArrayList<>();

        try {
            Statement comandoSQL = connection.createStatement();
            ResultSet rs = comandoSQL.executeQuery(Constants.selectAll(Constants.TABELA_USUARIO));

            while (rs.next()){
                Usuario user = new Usuario(rs.getString("nome"),rs.getString("email"),rs.getString("senha"));
                user.id = rs.getInt("id");
                users.add(user);
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return users;
    }

    public void getUser(String nome){

        Constants.selectFilter(nome, Constants.TABELA_USUARIO);

    }
}
