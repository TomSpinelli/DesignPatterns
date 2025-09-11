package Strategy;

public class DescontoProgressivo  implements MetodoPagamento{
    @Override
    public void pagar(double valor, int quantidade) {
        double total = valor*quantidade;
        System.out.println("No pagamento de valor " + total + "com seu desconto PROGRESSIVO você pagou " + total*calcularDesconto(quantidade));
    }

    private double calcularDesconto(int quantidade) {
        double descontoprogressivo = (0.05)*quantidade;
        return descontoprogressivo > 0.5? 0.5 : 1.0 - descontoprogressivo;

    }
}
