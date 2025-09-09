package factorymethod.documentos;

public class DocumentoRecibo extends Documento{
    @Override
    public void assinar() {
        System.out.println("Assinado RECIBO");
    }
}
