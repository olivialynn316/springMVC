package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wb-yxj268701
 * @date 2017/05/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDO {

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 有参构造器,不含id
     *
     * @param username
     * @param password
     */
    public UserDO(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
