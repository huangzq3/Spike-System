package demo.huangzq.exception;

/**
 * 秒杀关闭异常
 * Created by huangzhiqiang on 16/10/28.
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
