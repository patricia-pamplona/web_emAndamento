package dominio;

public class Produtos {
    private int id_produto;
    private int id_lojista;
    private String nome;
    private String descricao;
    private int preco;
    private int quantidade;
    private boolean carrinho;

    public Produtos (int id_produto, int id_lojista, String nome, String descricao, int preco, int quantidade, boolean carrinho){
        this.id_produto = id_produto;
        this.id_lojista= id_lojista;
        this.nome = nome;
        this.descricao = descricao;
        this. preco=preco;
        this.quantidade=quantidade;
        this.carrinho=carrinho;

    }

    public int getId_produto() {

        return id_produto;
    }
    public int getId_lojista() {

        return id_lojista;
    }

    public void setId_lojista(int id_lojista) {

        this.id_lojista = id_lojista;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public int getPreco() {

        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public boolean getCarrinho() {

        return carrinho;
    }

    public void setCarrinho(boolean carrinho) {

        this.carrinho = carrinho;
    }


}
