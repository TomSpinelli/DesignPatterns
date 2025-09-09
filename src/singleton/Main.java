package singleton;

import adapter.cartao.LeitorCartao;

public class Main {

    public static void main(String[] args) {

        //PRIMEIRA ATIVIDADE
        Logger logger = Logger.getInstance();
        logger.addlog("start");
        logger.addlog("process");
        logger.addlog("finish");
        logger.getLogs();
        logger.clearLog();
        logger.getLogs();
        System.out.println("");

        //SEGUNDA ATIVIDADE
        GameStates gameStates = GameStates.getInstance();
        GameStates gameStates2 = GameStates.getInstance();
        gameStates.aplicarPontos(2);
        gameStates2.aplicarPontos(3);
        gameStates.aplicarVidas(2);
        gameStates.getGameState();
        gameStates2.getGameState();

    }

}
