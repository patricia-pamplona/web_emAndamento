package persistencia;

import dominio.Lojista;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LojistaDAO {

        private Conexao minhaConexao;
        private final String selectGeral = "select * from lojista";

        public LojistaDAO(){
                minhaConexao = new Conexao ("jdbc:postgresql://localhost:5432/projProgWeb1", "postgres", "abc123");
        }

        public void listar (){
                ArrayList<Lojista> resultado = new ArrayList();

                try{
                        minhaConexao.conectar();
                        Statement instrucao = minhaConexao.getConexao().createStatement();
                        ResultSet resultSet = instrucao.executeQuery(selectGeral);
                        while (resultSet.next()){
                                Lojista l = new Lojista(resultSet.getInt("id_cliente"), resultSet.getString("nome"), resultSet.getString("email"), resultSet.getString("senha"));
                                resultado.add(l);
                        }

                        minhaConexao.desconectar();
                }catch (Exception e){
                        System.out.println("Erro LogistaDAO.listar: " + e.getMessage());
                }
                return resultado;
        }

}
