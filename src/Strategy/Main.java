package Strategy;

public class Main {
    public static void main(String[] args) {
        DescontoFixo descontoFixo =  new DescontoFixo();
        DescontoPercentual descontoPercentual = new DescontoPercentual();
        DescontoProgressivo descontoProgressivo = new DescontoProgressivo();
        Carrinho carrinho = new Carrinho();
        carrinho.setMetodoPagamento(descontoFixo);
        carrinho.pagar(200.0,2);
        carrinho.setMetodoPagamento(descontoPercentual);
        carrinho.pagar(200.0,2);
        carrinho.setMetodoPagamento(descontoProgressivo);
        carrinho.pagar(200.0,5);
    }
}
