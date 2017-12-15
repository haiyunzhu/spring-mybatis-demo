package dao;

import mybatis.dao.Person1Dao;
import mybatis.entity.Person1;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhuhaiyun on 2017/12/15.
 */
public class PersonDaoTest extends BaseTest{
    @Autowired
    private Person1Dao person1Dao;

    @Test
    public void testInsert() {
        person1Dao.insert(new Person1().builder().id(1).username("1").password("2").build());
    }
}
