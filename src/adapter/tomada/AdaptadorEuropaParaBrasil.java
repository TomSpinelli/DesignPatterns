package adapter.tomada;

public class AdaptadorEuropaParaBrasil  implements TomadaBrasileira{
    private SecadorAmericano secadorAmericano;

    public AdaptadorEuropaParaBrasil(SecadorAmericano secadorAmericano){
        this.secadorAmericano = secadorAmericano;
    }

    @Override
    public void LigarNaTomada() {
        System.out.println("ADAPTADOR");
        secadorAmericano.plugInFlatPlug();
    }
}
