package teste.exception;


import org.springframework.http.HttpStatus;

public enum ExceptionEnum {
	
	NAO_RETONA_VALOR(new teste.exception.ExceptionTemplate(-1, "Erro: Não retorna dados.", HttpStatus.BAD_REQUEST));

    private teste.exception.ExceptionTemplate exception;

	private ExceptionEnum( teste.exception.ExceptionTemplate exception){
        this.exception = exception;
    }

    public
    teste.exception.ExceptionTemplate getException(){
        return this.exception;
    }
}
