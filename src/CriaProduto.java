import javax.swing.*;

public class CriaProduto {
    private Estoque comercio;

    public CriaProduto(){
        comercio = new Comercio();
    }

    public void criaComercio(){
        comercio.desProduto("Real");
        Produto bolacha = new Produto(01,"Bolacha Água e Sal", 10, 3.50);
        Produto sabao = new Produto(02, "Sabão Ala",20,4.00);

        comercio.adicionaProduto(bolacha);
        comercio.adicionaProduto(sabao);
        
             for (Produto produto: comercio.getListaProdutos()){
                 JOptionPane.showMessageDialog(null,"Produtos do Comércio: "+comercio.getIdProduto()+"\n"+"Código: "+produto.getCodigo()+"\n"+"Descrição: "+produto.getDescricao()+"\n"+"Quantidade: "+produto.getQuantidade()+"\n"+"Preço Unitário: "+produto.getPreco()+"\n");
            }
    }
}

