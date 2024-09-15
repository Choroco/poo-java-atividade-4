import entities.EstoqueProduto;

public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.cadastrar("Nescau", 35, 8);
        estoque.exibirEstoque();
        estoque.removerQuantidade(7);
        estoque.exibirEstoque();
    }
}