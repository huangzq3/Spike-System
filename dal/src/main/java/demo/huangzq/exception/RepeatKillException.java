package demo.huangzq.exception;

/**
 * 重复秒杀异常
 * Created by huangzhiqiang on 16/10/28.
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
