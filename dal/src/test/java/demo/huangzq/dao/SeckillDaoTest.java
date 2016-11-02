package demo.huangzq.dao;

import base.BaseTest;
import demo.huangzq.entity.Seckill;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by huangzhiqiang on 16/10/28.
 */
public class SeckillDaoTest extends BaseTest {

    @Resource
    private SeckillDao seckillDao;

    @Test
    public void testQueryById() throws Exception {
        long id = 1000l;
        Seckill seckill = seckillDao.queryById(id);
        Assert.assertEquals("1000元秒杀iPhone7", seckill.getName());
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Seckill> seckills = seckillDao.queryAll(0, 10);
        for (Seckill seckill : seckills) {
            System.out.println(seckill);
        }
    }

    @Test
    public void testReduceNumber() throws Exception {
        Date killTime = new Date();
        System.out.println(killTime);
        int updateCount = seckillDao.reduceNumber(1000l, killTime);
        Assert.assertEquals(1, updateCount);
    }
}