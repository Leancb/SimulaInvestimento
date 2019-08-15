package teste.teste.model.service;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import teste.exception.ExceptionEnum;
import teste.teste.model.TesteApiModelInvestimento;
import teste.teste.utils.GsonUtils;

public class ApiServiceInvestimento {

    private static final Logger LOG = LoggerFactory.getLogger(ApiServiceInvestimento.class);
    private static final String MSG_EXCEPTION = "Exception :: ";

    public static TesteApiModelInvestimento processaApiInvestimento(){
        try {
            RestTemplate restTemplate = new RestTemplate();
            TesteApiModelInvestimento testeApiModelInvestimento = GsonUtils.stringToObject(restTemplate.getForObject("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador", String.class), TesteApiModelInvestimento.class);

        if (testeApiModelInvestimento.getId() != null) {
            LOG.info("Resposta recebida");
        } else {
            LOG.info("Um erro ocorreu");
            return null;
        }
            return testeApiModelInvestimento;
        } catch (Exception e) {
            LOG.error(MSG_EXCEPTION, e);
            throw ExceptionEnum.NAO_RETONA_VALOR.getException();
        }


        }


    }

