package singleton;

import java.util.ArrayList;
import java.util.List;


public class GameStates {

    private static GameStates instance;
    private int pontos;
    private int vidas;

    private GameStates(){

    }
    public static GameStates getInstance(){

        if(instance == null){
            instance = new GameStates();
        }
        return instance;
    }

    public void aplicarPontos(int pontos){
        this.pontos = this.pontos + pontos;
        System.out.println("pontos + " + pontos);
    }

    public void aplicarVidas(int vidas){
        System.out.println("Vidas + " + vidas);
        this.vidas = this.vidas + vidas;
    }

    public void getGameState(){
        System.out.println("Vidas  " + vidas + " //Pontos  " + pontos);
    }
}
