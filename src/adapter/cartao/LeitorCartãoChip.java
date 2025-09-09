package adapter.cartao;

public class LeitorCartãoChip implements LeitorCartao {
    public void lerChip(String dadosChip){
        System.out.println("LEITURA DE CHIP C" + dadosChip);
    }

    @Override
    public void lerDados(String dados) {
        lerChip(dados);
    }
}
