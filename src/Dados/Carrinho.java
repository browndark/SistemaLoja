package dados;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<dados.Produto> produtos = new ArrayList<>();

    public void adicionarProduto(dados.Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public List<dados.Produto> getProdutos() {
        return produtos;
    }
}
