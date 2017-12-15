package mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhuhaiyun on 2017/12/15.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person1 {
    private Integer id;
    private String username;
    private String password;
}
