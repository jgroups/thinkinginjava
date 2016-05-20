package me.lbing.concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by king on 16/5/21.
 */
public class CloseResource {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new IOBlocked(System.in));
        Thread.sleep(100);
        service.shutdownNow();
        System.in.close();
    }
}
