package composite;

public class Soldado implements ExercitoComposite {
    public String nome;
    public int valor;

    public Soldado(String nome,int valor){
        this.nome = nome;
        this.valor = valor;
    }


    @Override
    public void showDetails() {
        System.out.println("SOLDADO: "+ nome);
    }

    @Override
    public int showPower(int total) {
        System.out.println("SOLDADO: "+ nome + " poder " + valor);
        return total + valor;

    }
}
