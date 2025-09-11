package Observer;

public class main {

    public static void main(String[] args) {
        Cbf cbf = new Cbf();
        Time time1 = new Time("Santa CRUZ");
        Time time2 = new Time("Sport");
        cbf.setObservers(time2);
        cbf.setObservers(time1);
        cbf.notifyObserversResultado("Santa cruz 3 Sport 0");
        cbf.notifyObserversPartida("Santa vs Sport dia 12/02/2026 ");

    }
}
