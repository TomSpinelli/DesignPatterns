package adapter;

import adapter.cartao.LeitorCartao;
import adapter.cartao.LeitorCartaoAntigo;
import adapter.cartao.LeitorCartãoChip;
import adapter.impressora.AdaptadorImpressoraAntiga;
import adapter.impressora.ImpressoraAntiga;
import adapter.impressora.NovaImpressora;
import adapter.tomada.AdaptadorEuropaParaBrasil;
import adapter.tomada.SecadorAmericano;
import adapter.tomada.TomadaBrasileira;

public class main {

    public static void main(String[] args) {
        //adapter
        SecadorAmericano secadorAmericano = new SecadorAmericano();
        TomadaBrasileira tomadaBrasileira = new AdaptadorEuropaParaBrasil(secadorAmericano);
        tomadaBrasileira.LigarNaTomada();
        System.out.println("");

        ImpressoraAntiga impressoraAntiga = new ImpressoraAntiga();
        NovaImpressora novaImpressora = new AdaptadorImpressoraAntiga(impressoraAntiga);
        novaImpressora.imprimirDocumentos("PRINT TEXT");
        System.out.println("");

        LeitorCartao leitorCartaoAntigo = new LeitorCartaoAntigo();
        leitorCartaoAntigo.lerDados("1234");
        LeitorCartao leitorCartãoChip = new LeitorCartãoChip();
        leitorCartãoChip.lerDados("1234");

    }
}
