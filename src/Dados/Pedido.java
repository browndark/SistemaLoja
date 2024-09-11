package dados;

public class Pedido {

    public boolean isDisponivel(dados.Produto produto) {
        System.out.println("Verificando disponibilidade de " + produto.getNome() + "...");
        boolean disponivel = true;
        return disponivel;
    }

    public void gerarConfirmacao() {
        System.out.println("Pedido gerado com sucesso!");
    }
}
