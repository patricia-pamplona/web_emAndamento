package persistencia;

import dominio.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDAO {

    private Conexao minhaConexao;

    private final String selectGeral = "select * from cliente";
    private final String inserir = "INSERT INTO cliente (nome, email, senha) values (?, ?, ?) ";
    private final String alterar = "update cliente set nome = ?, email = ? , senha = ? where id = ? ";

    public ClienteDAO() {
        minhaConexao = new Conexao ("jdbc:postgresql://localhost:5432/projProgWeb1", "postgres", "abc123");
    }


    public void adicionar (Cliente c){
        try{
            minhaConexao.conectar();
            PreparedStatement instrucao  = minhaConexao.getConexao().prepareStatement(inserir);
            instrucao.setString(1, c.getNome());
            instrucao. setString(2, c.getEmail());
            instrucao.setString(3, c.getSenha());
            instrucao.execute();
            minhaConexao.desconectar();
            }
        catch (Exception e){
            System.out.println("Erro ClienteDAO.adicionar: " + e.getMessage());
        }
    }

    public void alterar (Cliente c){
        try {
            minhaConexao.conectar();
            PreparedStatement instrucao = minhaConexao.getConexao().prepareStatement(alterar);
            instrucao.setString(1, c.getNome());
            instrucao.setString(2, c.getEmail());
            instrucao.setString(3, c.getSenha());
            instrucao.execute();
            minhaConexao.desconectar();

        }catch (Exception e){
            System.out.println("Error ClienteDAO.alterar: " + e.getMessage());
        }
    }

    public ArrayList<Cliente> listar(){
        ArrayList<Cliente> resultado = new ArrayList();

        try{
            minhaConexao.conectar();
            Statement instrucao = minhaConexao.getConexao().createStatement();
            ResultSet resultSet = instrucao.executeQuery(selectGeral);
            while (resultSet.next()){
                Cliente c = new Cliente(resultSet.getInt("id_cliente"), resultSet.getString("nome"), resultSet.getString("email"), resultSet.getString("senha"));
                resultado.add(c);
            }
            minhaConexao.desconectar();

        }catch (Exception e){
            System.out.println("Erro ClienteDAO.listar: " + e.getMessage());
        }
        return resultado;
    }
}
