package demo.huangzq.dao;

import base.BaseTest;
import demo.huangzq.entity.SuccessKilled;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by huangzhiqiang on 16/10/28.
 */
public class SuccessKilledDaoTest extends BaseTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void testInsertSuccessKilled() {

        int count = successKilledDao.insertSuccessKilled(1000l,12222222222l);
        System.out.println(count);
    }

    @Test
    public void testQueryByIdWithSeckill() {
        SuccessKilled successKilled = new SuccessKilled();
        successKilled = successKilledDao.queryByIdWithSeckill(1000l,12222222222l);
        System.out.print("==========" + successKilled);
    }
}
