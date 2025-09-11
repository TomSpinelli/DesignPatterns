package Strategy;

public class DescontoFixo implements MetodoPagamento{
    @Override
    public void pagar(double valor, int quantidade) {
        double total = valor*quantidade;
        System.out.println("No pagamento de valor " + total + " com seu desconto  FIXO você pagou " + (total - 50.0));
    }
}
