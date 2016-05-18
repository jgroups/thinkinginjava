package me.lbing.concurrency;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by King on 2016/5/18.
 */
public class CallableDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(service.submit(new TaskWithResult(i)));
        }
        for (Future<String> result : results) {
            try {
                System.out.println(result.get());
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                service.shutdown();
            }
        }
    }

}

class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult:" + id;
    }

}