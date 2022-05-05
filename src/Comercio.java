import java.util.ArrayList;

public class Comercio implements Estoque{
      private String idProduto;
      private ArrayList<Produto> listaProdutos;

      public void adicionaProduto(Produto novoProduto){
          listaProdutos.add(novoProduto);
      }

      public void removeProduto(Produto removeProduto){
          listaProdutos.remove(removeProduto);
      }

      public ArrayList<Produto> getListaProdutos(){
          return listaProdutos;
      }

      public String getIdProduto(){
          return idProduto;
      }

    @Override
    public void desProduto(String id) {
        this.idProduto = id;
        listaProdutos = new ArrayList<Produto>();
    }
}
