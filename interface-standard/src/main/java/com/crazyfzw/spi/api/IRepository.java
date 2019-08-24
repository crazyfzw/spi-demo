package com.crazyfzw.spi.api;

/**
 * 数据库标准规范
 * @author crazyfzw
 * @since 1.0.0
 */
public interface IRepository {

    /**
     * 建立连接
     * @param url
     */
    void connect(String url);
}