package dominio;

public class Cliente {

    private int id_cliente ;
    private String nome;
    private String email;
    private String senha;

    public Cliente(int id_cliente, String nome, String email, String senha){
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getId_cliente() {

        return id_cliente;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getSenha() {

        return senha;
    }

    public void setSenha(String senha) {

        this.senha = senha;
    }
}
