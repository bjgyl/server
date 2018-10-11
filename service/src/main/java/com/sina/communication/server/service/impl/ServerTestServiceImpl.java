package com.sina.communication.server.service.impl;/**
 * Created by gyl on 2018/4/9.
 */

import com.alibaba.dubbo.rpc.RpcContext;
import com.sina.communication.server.service.ServerTestService;
import org.springframework.stereotype.Service;

/**
 * test
 *
 * @author gyl
 * @create 2018-04-09 09:43
 **/
@Service("serverTestService")
public class ServerTestServiceImpl implements ServerTestService {
    @Override
    public void test() {
        System.out.println("this is server test serviceimpl……");
    }
//    @Override
//    public void testMoney(Money money) {
//        System.out.println("this is server test serviceimpl, Money……");
//        if(null != money){
//            System.out.println(money.getAmount().floatValue());
//        }
//    }

    @Override
    public void testRpc() {
        System.out.println("开始 this is server rpc-test serviceimpl……");

        // 通过RpcContext获取用户传参，这里会返回userValue
        String value = RpcContext.getContext().getAttachment("userKey");
        System.out.println("server端的service获取到的attachment中的参数值=" + value);
        System.out.println("attachments=" + RpcContext.getContext().getAttachments());
        // 本端是否为提供端，这里会返回true
        boolean isProviderSide = RpcContext.getContext().isProviderSide();
        System.out.println("isProviderSide="+isProviderSide);
        // 获取调用方IP地址
        String clientIP = RpcContext.getContext().getRemoteHost();
        System.out.println("clientIP=" + clientIP);
        // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        String application = RpcContext.getContext().getUrl().getParameter("application");
        System.out.println("application=" + application);

        System.out.println("结束 this is server rpc-test serviceimpl……");
    }

    @Override
    public String testString() {
        return "testString,aaa";
    }

    @Override
    public String testReturn(String param1, String param2) {
        return param1 + " " + param2;
    }

    public void xxx() {
        // 通过RpcContext获取用户传参，这里会返回userValue
        String value = RpcContext.getContext().getAttachment("userKey");
        System.out.println("server端的service获取到的attachment中的参数值=" + value);
        // 本端是否为提供端，这里会返回true
        boolean isProviderSide = RpcContext.getContext().isProviderSide();
        System.out.println("isProviderSide="+isProviderSide);
        // 获取调用方IP地址
        String clientIP = RpcContext.getContext().getRemoteHost();
        System.out.println("clientIP=" + clientIP);
        // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        String application = RpcContext.getContext().getUrl().getParameter("application");
        System.out.println("application=" + application);

        // 注意：每发起RPC调用，上下文状态会变化
//        yyyService.yyy();
        // 此时本端变成消费端，这里会返回false
//        boolean isProviderSide = RpcContext.getContext().isProviderSide();
    }
}
