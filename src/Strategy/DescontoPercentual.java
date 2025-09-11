package Strategy;

public class DescontoPercentual implements MetodoPagamento{

    @Override
    public void pagar(double valor, int quantidade) {
        double total = valor*quantidade;
        System.out.println("No pagamento de valor " +total + "com seu desconto  Percentual você pagou  " + total*0.9);
    }
}
