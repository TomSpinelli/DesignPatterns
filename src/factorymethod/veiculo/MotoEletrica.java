package factorymethod.veiculo;

public class MotoEletrica implements VeiculoEletrico{
    @Override
    public void carregar() {
        System.out.println("Moto carregando");
    }
}
