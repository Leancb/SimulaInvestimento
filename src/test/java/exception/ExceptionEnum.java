package exception;

import org.springframework.http.HttpStatus;

public enum ExceptionEnum {
	
	NAO_RETONA_VALOR(new exception.ExceptionTemplate(-1, "Erro: Não retorna dados.", HttpStatus.BAD_REQUEST));

    private exception.ExceptionTemplate exception;

	private ExceptionEnum( exception.ExceptionTemplate exception){
        this.exception = exception;
    }

    public
    exception.ExceptionTemplate getException(){
        return this.exception;
    }
}
