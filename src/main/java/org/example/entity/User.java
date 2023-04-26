package org.example.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * <a href="https://baomidou.com/pages/226c21/#编码">数据库脚本</a> * </p>
 *
 * @author XJH
 * @version 1.0
 * @since 2023/4/25
 */
@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}