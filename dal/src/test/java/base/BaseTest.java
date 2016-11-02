package base;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangzhiqiang on 16/10/28.
 */
@Ignore
@ContextConfiguration(locations = "classpath:dal.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

    protected void prepareData(String sqlFile) {
        super.executeSqlScript("classpath:sql\\" + sqlFile, false);
    }
}