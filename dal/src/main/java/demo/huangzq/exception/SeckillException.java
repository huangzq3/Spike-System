package demo.huangzq.exception;

/**
 * Created by huangzhiqiang on 16/10/28.
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
