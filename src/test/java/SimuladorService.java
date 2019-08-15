import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import teste.TesteApplication;
import teste.teste.model.TesteApiModelInvestimento;
import teste.teste.model.service.ApiServiceInvestimento;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TesteApplication.class)
@ActiveProfiles("test")

public class SimuladorService {

    @Test
    public void validaIdInvestimento() {

        TesteApiModelInvestimento testeApiModelInvestimento = ApiServiceInvestimento.processaApiInvestimento();


        Assert.assertEquals(testeApiModelInvestimento.getId(), "1");

        List<String> stringList = new ArrayList<>();
        stringList.add("112");
        stringList.add("124");
        stringList.add("136");
        stringList.add("148");


        for (String mes : testeApiModelInvestimento.getMeses() ) {

            System.out.println(mes);

            // String nome = testeApiCharacter.getName();

            if (testeApiModelInvestimento.getMeses().equals("112")) {

                Assert.assertEquals(testeApiModelInvestimento.getMeses(), "122");

                System.out.println("Teste valida que existe id " + testeApiModelInvestimento.getId() + " validando funcionamento da API.");

            }
        }
    }

}
