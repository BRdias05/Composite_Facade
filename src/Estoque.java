import java.util.ArrayList;

public interface Estoque {
    void desProduto(String id);

    String getIdProduto();

    ArrayList<Produto> getListaProdutos();

    void adicionaProduto(Produto novoProduto);

    void removeProduto(Produto removeProduto);

}
