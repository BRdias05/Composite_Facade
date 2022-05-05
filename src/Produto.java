public class Produto {
    private double codigo;
    private String descricao;
    private double quantidade;
    private double preco;

    public Produto(double codigo, String descricao, double quantidade, double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
