public class Produto implements ProdutoInterface {
    private int id;  // Changed access modifier to private
    private String nome;
    private String descricao;
    private double preco;

    public Produto(int id, String nome, String descricao, double preco) {
        this.id = id;  // Inicializando o campo id
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {  // Implemented setId method
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
