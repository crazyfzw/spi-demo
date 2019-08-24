package com.crazyfzw.spi.apiimpl.oracle;

import com.crazyfzw.spi.api.IRepository;

/**
 * Oracle 实现
 * @author crazyfzw
 * @since 1.0.0
 */
public class OracleRepository implements IRepository {

    @Override
    public void connect(String url) {
        System.out.println("connect " + url + " to Oracle");
    }
}

