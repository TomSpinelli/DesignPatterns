
package composite;

import java.util.ArrayList;
import java.util.List;





public class Exercito implements ExercitoComposite {
    public String nome;
    public List<Batalhao> components = new ArrayList<>();
    public Exercito(String nome){
        this.nome = nome;
    }

    public void addComponents(Batalhao component){
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("EXERCITO: " + nome);
        for(ExercitoComposite component : components){
            component.showDetails();
        }
    }
}
