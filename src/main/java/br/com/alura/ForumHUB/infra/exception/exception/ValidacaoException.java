package br.com.alura.ForumHUB.infra.exception.exception;

public class ValidacaoException extends RuntimeException {

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}
