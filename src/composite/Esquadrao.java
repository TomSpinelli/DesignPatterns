package composite;

import java.util.ArrayList;
import java.util.List;

public class Esquadrao implements ExercitoComposite {
    public String nome;
    public List<Soldado> components = new ArrayList<>();
    public Esquadrao(String nome){
        this.nome = nome;
    }

    public void addComponents(Soldado component){
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("ESQUADRAO: " + nome);
        for(ExercitoComposite component : components){
            component.showDetails();
        }
    }

    @Override
    public int showPower(int total) {
        System.out.println("ESQUADRAO: " + nome);
        for(ExercitoComposite component : components){
            total = component.showPower(total);
        }
        return total;
    }
}
