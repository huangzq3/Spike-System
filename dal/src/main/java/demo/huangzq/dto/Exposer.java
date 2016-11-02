package demo.huangzq.dto;

/**
 * 暴露秒杀地址
 * Created by huangzhiqiang on 16/10/28.
 */
public class Exposer {
    private boolean exposer;    //是否开启秒杀
    private String  md5;
    private long    seckillId;
    private long    now;        //系统当前时间
    private long    start;
    private long    end;

    public Exposer(boolean exposer, String md5, long seckillId) {
        this.exposer = exposer;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(boolean exposer, long seckillId, long now, long end, long start) {
        this.exposer = exposer;
        this.seckillId = seckillId;
        this.now = now;
        this.end = end;
        this.start = start;
    }

    public Exposer(boolean exposer, long seckillId) {
        this.exposer = exposer;
        this.seckillId = seckillId;
    }

    public boolean isExposer() {
        return exposer;
    }

    public void setExposer(boolean exposer) {
        this.exposer = exposer;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}
