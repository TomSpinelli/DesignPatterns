package decorator;




public class HardcoreDecorator extends MissaoDecorator {

    public HardcoreDecorator(Missao missao) {
        super(missao);
    }

    @Override
    public String getDescription() {
        return missao.getDescription() + ", HARDCORE";
    }

    @Override
    public double getBounty() {
        return missao.getBounty()*1.5;
    }
}
