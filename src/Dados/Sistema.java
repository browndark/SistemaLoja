package dados;

public class Sistema {
    private dados.Carrinho carrinho;
    private dados.Pedido pedido;

    public Sistema() {
        this.carrinho = new dados.Carrinho();
        this.pedido = new dados.Pedido();
    }

    public dados.Carrinho getCarrinho() {
        return carrinho;
    }

    public dados.Pedido getPedido() {
        return pedido;
    }

    public void adicionarProdutoAoCarrinho(dados.Produto produto) {
        carrinho.adicionarProduto(produto);
    }

    public boolean verificarDisponibilidade(dados.Produto produto) {
        return pedido.isDisponivel(produto);
    }

    public void criarPedido() {
        if (verificarDisponibilidade(carrinho.getProdutos().get(0))) {
            pedido.gerarConfirmacao();
            System.out.println("Compra confirmada!");
        } else {
            System.out.println("Produto não disponível.");
        }
    }
}
