package me.lbing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by King on 2016/5/19.
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!generator.isCancled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancle();//Cancles all EvenCheckers
            }

        }
    }

    //Test any type of IntGenerator
    public static void test(IntGenerator ig, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            service.execute(new EvenChecker(ig, i));
        }
    }

    public static void test(IntGenerator ig){
        test(ig,10);
    }
}
