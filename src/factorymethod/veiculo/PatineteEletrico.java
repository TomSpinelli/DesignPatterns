package factorymethod.veiculo;

public class PatineteEletrico implements VeiculoEletrico{
    @Override
    public void carregar() {
        System.out.println("Patinete carregando");
    }
}
