package factorymethod.veiculo;

public class CarroEletrico implements VeiculoEletrico{
    @Override
    public void carregar() {
        System.out.println("Carro carregando");
    }
}
