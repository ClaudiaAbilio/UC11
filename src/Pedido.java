/*
 Claudia Abilio - PI - Fev 2025
 */


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;   
    private LocalDate dataVenda;
    private int clienteId;
    private Double total;
    private List<DetalhePedido> detalhes;

    public Pedido(int id, LocalDate dataVenda, int clienteId, double total) {
        this.id = id; 
        this.dataVenda = dataVenda;
        this.clienteId = clienteId;
        this.total = total;
        this.detalhes = new ArrayList<>();
        calcularTotal(); // Certifique-se de calcular o total ao criar o pedido
    }

    public Pedido(LocalDate dataVenda) {
        this(0, dataVenda, 0, 0.0); // Call the main constructor with default values
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<DetalhePedido> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(List<DetalhePedido> detalhes) {
        this.detalhes = detalhes;
        calcularTotal();
    }

    public void adicionarDetalhe(DetalhePedido detalhe) {
        detalhes.add(detalhe);
        calcularTotal();
    }

    public void calcularTotal() {  // Alterado para public
        total = detalhes.stream()
                        .mapToDouble(d -> d.getQuantidade() * d.getPrecoUnitario())
                        .sum();
    }
}
