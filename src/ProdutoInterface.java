/*
 Claudia Abilio - PI - UC 15 - 2025
 */


public interface ProdutoInterface {
    int getId();
    void setId(int id);
    
    String getNome();
    void setNome(String nome);
    
    String getDescricao();
    void setDescricao(String descricao);
    
    double getPreco();
    void setPreco(double preco);
}