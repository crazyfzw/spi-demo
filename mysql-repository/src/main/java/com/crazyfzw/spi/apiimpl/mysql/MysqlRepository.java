package com.crazyfzw.spi.apiimpl.mysql;

import com.crazyfzw.spi.api.IRepository;

/**
 * Mysql 实现
 * @author crazyfzw
 * @since 1.0.0
 */
public class MysqlRepository implements IRepository {

    @Override
    public void connect(String url) {
        System.out.println("connect " + url + " to Mysql");
    }
}