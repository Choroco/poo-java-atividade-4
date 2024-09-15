package entities;

public class EstoqueProduto {
    private String descricao;
    private int quantidade;
    private double valor;

    public void cadastrar(String descricao, int quantidade, double valor){
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void removerQuantidade(int quantidade){
        if(quantidade != 0 && quantidade <= this.quantidade){
            this.quantidade -= quantidade;
            System.out.println("Quantidade removida: "+quantidade);
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public void exibirEstoque(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("Valor: R$"+this.valor);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
