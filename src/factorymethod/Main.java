package factorymethod;

import factorymethod.documentos.Documento;
import factorymethod.documentos.DocumentoFactory;
import factorymethod.pagamento.Pagamento;
import factorymethod.pagamento.PagamentoFactory;
import factorymethod.veiculo.VeiculoEletrico;
import factorymethod.veiculo.VeiculoEletricoFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //ATIVIDADE 1
        VeiculoEletricoFactory veiculoEletricoFactory = new VeiculoEletricoFactory();
        VeiculoEletrico veiculoEletricoCarro = veiculoEletricoFactory.getVeiculoEletrico("CARRO");
        VeiculoEletrico veiculoEletricoMoto =  veiculoEletricoFactory.getVeiculoEletrico("MOTO");
        VeiculoEletrico veiculoEletricoPatinete =  veiculoEletricoFactory.getVeiculoEletrico("PATINETE");
        System.out.println("");

        veiculoEletricoMoto.carregar();
        veiculoEletricoCarro.carregar();
        veiculoEletricoPatinete.carregar();

        //ATIVIDADE 2
        PagamentoFactory pagamentoFactory = new PagamentoFactory();
        Pagamento pagamentoCredito = pagamentoFactory.getPagamento("CREDITO");
        Pagamento pagamentoDebito = pagamentoFactory.getPagamento("DEBITO");
        Pagamento pagamentoBoleto = pagamentoFactory.getPagamento("BOLETO");
        System.out.println("");

        pagamentoCredito.realizarPagamento();
        pagamentoDebito.realizarPagamento();
        pagamentoBoleto.realizarPagamento();

        //ATIVIDADE 3
        DocumentoFactory documentoFactory = new DocumentoFactory();
        Documento documentoContrato = documentoFactory.getDocumento("CONTRATO");
        Documento documentoNotaFiscal = documentoFactory.getDocumento("NOTAFISCAL");
        Documento documentoRecibo = documentoFactory.getDocumento("RECIBO");
        System.out.println("");

        documentoContrato.assinar();
        documentoNotaFiscal.assinar();
        documentoRecibo.assinar();
    }
}
