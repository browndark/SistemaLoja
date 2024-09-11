import dados.Carrinho;
import dados.Pedido;
import dados.Produto;
import dados.Sistema;

public class Principal {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("@brunoccs100");
        System.out.println("==================================");

        Sistema sistema = new Sistema();

        Produto produto1 = new Produto("Camiseta", 29.99);
        Produto produto2 = new Produto("Calça", 49.99);
        sistema.adicionarProdutoAoCarrinho(produto1);
        if (sistema.verificarDisponibilidade(produto1)) {

            sistema.criarPedido();
        } else {
            System.out.println("Produto não disponível.");
        }
    }
}
