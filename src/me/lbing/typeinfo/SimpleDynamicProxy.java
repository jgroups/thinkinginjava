package me.lbing.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by King on 2016/5/11.
 */
public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingelse("---xixi----");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
//        consumer(real);

        //Insert a proxy and call again
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}

class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("****************************************************");
        System.out.println("* proxy:" + proxy.getClass());
        System.out.println("* method:" + method);
        System.out.println("* args:" + args);
        System.out.println("****************************************************");
        if (args != null) {
            for (Object arg : args) {
                System.out.println("参数列表:" + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}
