/*
 Claudia Abilio - PI - Fev 2025
 */


public class DetalhePedido {

    private int pedidoID;
    private int produtoId;
    private int quantidade;
    private Double precoUnitario;

    public DetalhePedido(int pedidoID, int produtoId, int quantidade, Double precoUnitario) {
        this.pedidoID = pedidoID;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters e Setters

    public int getVendaId() {
        return pedidoID;
    }

    public void setVendaId(int pedidoID) {
        this.pedidoID = pedidoID;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
