package decorator;

public abstract class MissaoDecorator implements Missao {
   protected Missao missao;

    public MissaoDecorator(Missao missao) {
        this.missao = missao;
    }


    @Override
    public String getDescription() {
        return missao.getDescription();
    }

    @Override
    public double getBounty() {
        return missao.getBounty();
    }
}
