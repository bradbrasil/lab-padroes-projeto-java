package facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facade {
    public void migrarCliente (String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarCidade(cep);

        CrmService.gravarCliente(nome, cep,cidade, estado);

    }

}
