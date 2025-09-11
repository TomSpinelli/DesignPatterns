package composite;

public class Main {
    public static void main(String[] args) {

        Exercito exercito = new Exercito("Brasil");

        Batalhao batalhao = new Batalhao("PE");
        Batalhao batalhao2 = new Batalhao("RJ");

        Esquadrao squad1 = new Esquadrao("tatico");
        Esquadrao squad2 = new Esquadrao("militar");
        Esquadrao squad3 = new Esquadrao("BOPE");

        Soldado soldier = new Soldado("GIJOE");
        Soldado soldier2 = new Soldado("RAMBO");
        Soldado soldier3 = new Soldado("recruta");
        Soldado soldier4 = new Soldado("hacker");
        Soldado soldier5 = new Soldado("CPT NASCIMENTO");
        Soldado soldier6 = new Soldado("MATHIAS");

        squad1.addComponents(soldier);
        squad1.addComponents(soldier2);
        squad2.addComponents(soldier3);
        squad2.addComponents(soldier4);
        squad3.addComponents(soldier5);
        squad3.addComponents(soldier6);
        batalhao.addComponents(squad1);
        batalhao.addComponents(squad2);
        batalhao2.addComponents(squad3);
        exercito.addComponents(batalhao);
        exercito.addComponents(batalhao2);
        exercito.showDetails();

    }
}
