package demo.huangzq.dao;

import demo.huangzq.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by huangzhiqiang on 16/10/28.
 */
public interface SeckillDao {

    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    Seckill queryById(@Param("seckillId") long seckillId);

    List<Seckill> queryAll(@Param("offet") int offet, @Param("limit") int limit);

    void killByProcedure(Map<String,Object> paramMap);
}
