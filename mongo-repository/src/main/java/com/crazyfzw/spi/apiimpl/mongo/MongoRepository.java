package com.crazyfzw.spi.apiimpl.mongo;

import com.crazyfzw.spi.api.IRepository;

/**
 * Mongo 实现
 * @author crazyfzw
 * @since 1.0.0
 */
public class MongoRepository implements IRepository {

    @Override
    public void connect(String url) {
        System.out.println("connect " + url + " to Mongo");
    }
}

