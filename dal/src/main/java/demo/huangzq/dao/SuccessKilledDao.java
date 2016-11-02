package demo.huangzq.dao;

import demo.huangzq.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * Created by huangzhiqiang on 16/10/28.
 */
public interface SuccessKilledDao {

    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
