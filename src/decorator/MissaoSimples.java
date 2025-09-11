package decorator;

public class MissaoSimples implements Missao {
    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double getBounty() {
        return 100.0;
    }
}


