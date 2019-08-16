import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import teste.TesteApplication;
import teste.teste.model.TesteApiModelInvestimento;
import teste.teste.service.ApiServiceInvestimento;

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

        for (int i = 0; i < testeApiModelInvestimento.getMeses().size(); i++) {

            Assert.assertEquals(testeApiModelInvestimento.getMeses().get(i), stringList.get(i));

            System.out.println("\n Aplicação Sicredi em " + testeApiModelInvestimento.getMeses().get(i) + " meses terá saldo de R$ " + testeApiModelInvestimento.getValor().get(i) +",00");

        }
    }

}
