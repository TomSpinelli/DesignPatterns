package adapter.impressora;

public class AdaptadorImpressoraAntiga implements NovaImpressora {
    private ImpressoraAntiga impressoraAntiga;

    public AdaptadorImpressoraAntiga(ImpressoraAntiga impressoraAntiga){
        this.impressoraAntiga = impressoraAntiga;
    }

    @Override
    public void imprimirDocumentos(String doc) {
        System.out.println("ADAPTADOR");
        impressoraAntiga.printar(doc);

    }
}
