package decorator;

public class NoturnaDecorator extends MissaoDecorator {

    public NoturnaDecorator(Missao missao) {
        super(missao);
    }

    @Override
    public String getDescription() {
        return missao.getDescription() + ", NIGHT";
    }

    @Override
    public double getBounty() {
        return missao.getBounty() * 1.1;
    }
}
