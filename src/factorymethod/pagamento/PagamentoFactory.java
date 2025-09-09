package factorymethod.pagamento;

import java.io.IOException;

public class PagamentoFactory {

    public Pagamento getPagamento(String tipo) throws IOException {
        if(tipo.equals("CREDITO")){
            return new PagamentoCartaoCredito();
        }else if(tipo.equals("DEBITO")){
            return new PagamentoCartaoDebito();
        }else if(tipo.equals("BOLETO")){
            return new PagamentoBoleto();
        }else{
            throw new IOException();
        }

    }
}
