package com.sina.communication.server.service;/**
 * Created by gyl on 2018/4/9.
 */

/**
 * test
 *
 * @author gyl
 * @create 2018-04-09 07:40
 **/

public interface ServerTestService {

    public void test();

//    public void testMoney(Money money);

    public void testRpc();

    public String testString();

    public String testReturn(String param1, String param2);
}
