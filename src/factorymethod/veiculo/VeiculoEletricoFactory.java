package factorymethod.veiculo;

import java.io.IOException;

public class VeiculoEletricoFactory {

    public VeiculoEletrico getVeiculoEletrico(String tipo) throws IOException {
        if(tipo.equals("CARRO")){
            return new CarroEletrico();
        }else if(tipo.equals("MOTO")){
            return new MotoEletrica();
        }else if(tipo.equals("PATINETE")){
            return new PatineteEletrico();
        }else{
            throw new IOException();
        }

    }
}
