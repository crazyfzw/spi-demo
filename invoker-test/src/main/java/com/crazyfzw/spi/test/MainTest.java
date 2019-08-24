package com.crazyfzw.spi.test;

import com.crazyfzw.spi.api.IRepository;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 测试类
 * @author crazyfzw
 * @since 1.0.0
 */
public class MainTest {

    public static void main(String[] args) {

        ServiceLoader<IRepository> serviceLoader = ServiceLoader.load(IRepository.class);

        Iterator<IRepository> it = serviceLoader.iterator();
        while (it != null && it.hasNext()){
            IRepository repositoryService = it.next();
            System.out.println("class:" + repositoryService.getClass().getName());
            repositoryService.connect("172.0.0.1:3306");
        }

    }

}
