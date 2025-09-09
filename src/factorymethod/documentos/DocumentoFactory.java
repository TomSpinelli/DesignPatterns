package factorymethod.documentos;

import java.io.IOException;

public class DocumentoFactory {

    public Documento getDocumento(String tipo) throws IOException {
        if(tipo.equals("CONTRATO")){
            return new DocumentoContrato();
        }else if(tipo.equals("NOTAFISCAL")){
            return new DocumentoNotaFiscal();
        }else if(tipo.equals("RECIBO")){
            return new DocumentoRecibo();
        }else{
            throw new IOException();
        }

    }
}
