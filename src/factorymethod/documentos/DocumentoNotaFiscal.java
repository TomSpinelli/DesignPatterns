package factorymethod.documentos;

public class DocumentoNotaFiscal extends Documento{
    @Override
    public void assinar() {
        System.out.println("Assinado NOTA FISCAL");
    }
}
