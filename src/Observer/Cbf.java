package Observer;

import java.util.ArrayList;
import java.util.List;

public class Cbf {

    private final List<Observer> observers = new ArrayList<>();
    private double preço;

    public void setObservers(Observer observer){
        observers.add(observer);
    }

    public void logPartidaMarcada(String text) {
        notifyObserversPartida("info da partida " + text);
    }

    public void logResultado(String text) {
        notifyObserversResultado("A partida foi " + text);
    }

    public void notifyObserversPartida(String partida){
        for(Observer observer : observers ){
            observer.updatePartida(partida);
        }

    }

    public void notifyObserversResultado(String resultado){
        for(Observer observer : observers ){
            observer.updateResultado(resultado);
        }

    }
}
