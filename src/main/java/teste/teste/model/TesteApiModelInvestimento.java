package teste.teste.model;

import java.util.List;

public class TesteApiModelInvestimento {

    private String id;
    private List<String> mes;
    private List<String> valor;


    public TesteApiModelInvestimento( String id, List<String> mes, List<String> valor ) {
        this.id = id;
        this.mes = mes;
        this.valor = valor;
    }


    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public List<String> getMeses() {
        return mes;
    }

    public void setMeses( List<String> meses ) {
        this.mes = mes;
    }

    public List<String> getValor() {
        return valor;
    }

    public void setValor( List<String> valor ) {
        this.valor = valor;
    }



}
