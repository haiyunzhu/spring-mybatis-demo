package mybatis.dao;

import mybatis.entity.Person1;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhuhaiyun on 2017/12/15.
 */
public interface Person1Dao {
    void insert(@Param("person1") Person1 person1);
}
