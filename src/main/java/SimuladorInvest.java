import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimuladorInvest {

    private WebDriver navegador;
    private WebDriver nave;

    @Test
    @Dado("^que configurei ambiente para acessar Simulador$")
    public void configuraSimuladorDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
    }

    @Quando("^abri tela do simulador de investimento$")
    public void abreSimulador() {
        navegador = new ChromeDriver();
        navegador.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
        navegador.manage().window().maximize();
    }

    @Quando("^marquei para você em informe seu perfil$")
    public void marqueInformeVoce(){
        navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[1]/input[1]")).click();
    }

    @Quando("^marquei para sua empresa em informe seu perfil$")
    public void marqueInformeEmpresa(){
        navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[1]/input[2]")).click();
    }

    @Quando("^informei valor a aplicar (.*)$")
    public void valorAplic(String arg1) {
        navegador.findElement(By.id("valorAplicar")).sendKeys(arg1);
    }

    @Quando("^informei valor a poupar por mês (.*)")
    public void valorPouparMes(String arg1) {
        navegador.findElement(By.id("valorInvestir")).sendKeys(arg1);
    }

    @Quando("^informei o tempo de aplicação por mês (.*)$")
    public void temploAplicMes(String arg1) throws InterruptedException {

        navegador.findElement(By.id("tempo")).sendKeys(arg1);

        navegador.findElement(By.cssSelector("#formInvestimento > div:nth-child(4) > div.blocoInputs.clearfix > div.blocoFormulario.blocoMeses.blocoSelect > a > span.btn")).click();
        Thread.sleep(Long.parseLong("300"));
        navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/ul/li[1]/a")).click();
    }


    @Quando("^cliquei no botão simular$")
    public void clickSimula(){

        navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button")).click();

    }


    @Entao("^Retorna a tela com resultado$")
    public void retornaSimulacao() throws InterruptedException {

        Thread.sleep(500);

        String var2;

        var2 = navegador.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/a")).getText();

        if (var2 == null) {
            System.out.println("\nErro, algo não funcionou");
        } else {
            Assert.assertTrue(var2.contains("REFAZER A SIMULAÇÃO"));
        }

        navegador.quit();
    }

    @Quando("^informei valor a poupar por ano (.*)")
    public void valorPouparAno(String arg1) {
        navegador.findElement(By.id("valorInvestir")).sendKeys(arg1);
    }

    @Quando("^informei o tempo de aplicação por ano (.*)$")
    public void temploAplicAno(String arg1) throws InterruptedException {

        navegador.findElement(By.id("tempo")).sendKeys(arg1);

        navegador.findElement(By.cssSelector("#formInvestimento > div:nth-child(4) > div.blocoInputs.clearfix > div.blocoFormulario.blocoMeses.blocoSelect > a > span.btn")).click();
        Thread.sleep(Long.parseLong("300"));
        navegador.findElement(By.xpath("//*[@id=\"formInvestimento\"]/div[4]/div[2]/div[2]/ul/li[1]/a")).click();
    }

    @Quando("^Valida se solicitou campo valor aplicar$")
    public void validacampoObrigatorio() throws InterruptedException {

        String var2;

        var2 = navegador.findElement(By.id("valorAplicar-error")).getText();

        if (var2 == null) {
            System.out.println("\nErro, algo não funcionou");
        } else {
            Assert.assertTrue(var2.contains("Valor mínimo de 20.00"));
        }
    navegador.quit();

    }

    @Quando("^Valida se solicitou campo valor investir")
    public void validacampoObrigatorioInvestir() throws InterruptedException {

        String var2;

        var2 = navegador.findElement(By.id("valorInvestir-error")).getText();

        if (var2 == null) {
            System.out.println("\nErro, algo não funcionou");
        } else {
            Assert.assertTrue(var2.contains("Valor mínimo de 20.00"));
        }
        navegador.quit();

    }


}
