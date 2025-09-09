package adapter.cartao;

public class LeitorCartaoAntigo implements LeitorCartao  {
    public void lerTarjaMagnetica(String dadosTarja){
        System.out.println("LEITURA DE TARJA MAGNETICA T" + dadosTarja);
    }

    @Override
    public void lerDados(String dados) {
        lerTarjaMagnetica(dados);
    }
}
