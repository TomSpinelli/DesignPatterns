package Strategy;

public class Carrinho {

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(double valor, int quantidade){
        if(metodoPagamento == null){
            System.out.println("nao tem metodo selecionado");
        }else{
            metodoPagamento.pagar(valor, quantidade);
        }
    }

    MetodoPagamento metodoPagamento;
}
