package composite;

public class Soldado implements ExercitoComposite {
    public String nome;

    public Soldado(String nome){
        this.nome = nome;
    }


    @Override
    public void showDetails() {
        System.out.println("SOLDADO: "+ nome);
    }
}
