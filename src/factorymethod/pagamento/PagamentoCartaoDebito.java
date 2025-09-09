package factorymethod.pagamento;

public class PagamentoCartaoDebito  extends Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("PAGO VIA DEBITO");
    }
}
