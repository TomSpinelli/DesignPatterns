
package decorator;

public class RestricaoTempoDecorator extends MissaoDecorator {

    public RestricaoTempoDecorator(Missao missao) {
        super(missao);
    }

    @Override
    public String getDescription() {
        return missao.getDescription() + ", TIME RESTRICTION";
    }

    @Override
    public double getBounty() {
        return missao.getBounty() * 1.2;
    }
}
