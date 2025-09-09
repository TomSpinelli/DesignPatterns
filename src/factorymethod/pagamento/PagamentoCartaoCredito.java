package factorymethod.pagamento;

public class PagamentoCartaoCredito  extends Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("PAGO VIA CREDITO ");
    }
}
