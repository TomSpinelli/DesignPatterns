package decorator;

public class Main {
    public static void main(String[] args) {





        Missao missao = new MissaoSimples();
        System.out.println(missao.getBounty()+" "+missao.getDescription());
        Missao missaoNoturna = new NoturnaDecorator(missao);
        System.out.println(missaoNoturna.getBounty()+" "+missaoNoturna.getDescription());
        Missao missaoNoturnaHardcore = new HardcoreDecorator(missaoNoturna);
        System.out.println(missaoNoturnaHardcore.getBounty()+" "+missaoNoturnaHardcore.getDescription());
        Missao missaoNoturnaHardcoreTempo = new RestricaoTempoDecorator(missaoNoturnaHardcore);
        System.out.println(missaoNoturnaHardcoreTempo.getBounty()+" "+missaoNoturnaHardcoreTempo.getDescription());
    }
}
