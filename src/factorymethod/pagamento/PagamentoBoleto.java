package factorymethod.pagamento;

public class PagamentoBoleto extends Pagamento{
    @Override
    public void realizarPagamento() {
        System.out.println("PAGO VIA BOLETO");
    }
}
