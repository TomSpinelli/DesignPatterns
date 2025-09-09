package factorymethod.documentos;

public class DocumentoContrato extends Documento{
    @Override
    public void assinar() {
        System.out.println("Assinado CONTRATO");
    }
}
