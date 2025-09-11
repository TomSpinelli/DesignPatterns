package composite;

import java.util.ArrayList;
import java.util.List;





public class Batalhao implements ExercitoComposite {
    public String nome;
    public List<Esquadrao> components = new ArrayList<>();
    public Batalhao(String nome){
        this.nome = nome;
    }

    public void addComponents(Esquadrao component){
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("BATALHAO: " + nome);
        for(ExercitoComposite component : components){
            component.showDetails();
        }
    }
}
