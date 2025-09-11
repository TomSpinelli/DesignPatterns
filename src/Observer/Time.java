package Observer;

public class Time implements Observer {
    private final String name;

    public Time(String name) {
        this.name = name;
    }


    @Override
    public void updatePartida(String partida) {
        System.out.println(name + " notificado sobre a data da partida //" + partida);
    }

    @Override
    public void updateResultado(String resultado) {
        System.out.println(name + " notificado sobre o resultado da partida //" + resultado);
    }
}
