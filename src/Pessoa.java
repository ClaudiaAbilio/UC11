/*
 Claudia Abilio - PI - Atividade 3 - jan 2025
 */

public class Pessoa {
    private int id; // Campo id adicionado
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(int id, String nome, String endereco, String telefone) {
        this.id = id; // Inicializando o campo id
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
