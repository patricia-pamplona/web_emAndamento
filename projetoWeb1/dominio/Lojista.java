package dominio;

public class Lojista {

    private int id_lojista ;
    private String nome;
    private String email;
    private String senha;

    public Lojista (int id_lojista, String nome, String email, String senha){
        this.id_lojista = id_lojista;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getIdid_lojista() {
        return id_lojista;
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
