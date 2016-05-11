package me.lbing.typeinfo;

/**
 * Created by King on 2016/5/11.
 */
public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingelse("---xixi----");

    }

    public static void main(String[] args) {
//        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

interface Interface {
    void doSomething();
    void somethingelse(String arg);
}

class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doing something");
    }

    @Override
    public void somethingelse(String arg) {
        System.out.println("doing something else");
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doing something before");
        proxied.doSomething();
        System.out.println("SimpleProxy doing something after");
    }

    @Override
    public void somethingelse(String arg) {
        System.out.println("SimpleProxy doing something else before");
        proxied.doSomething();
        System.out.println("SimpleProxy doing something else after");
    }
}

