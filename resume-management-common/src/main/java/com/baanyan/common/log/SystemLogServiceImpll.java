package com.baanyan.common.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by steve on 3/2/16.
 */
public class SystemLogServiceImpll implements SystemLogService {

    Log loger = LogFactory.getLog(SystemLogServiceImpl.class);
    private LinkedBlockingQueue<SystemLog> queue = new LinkedBlockingQueue<SystemLog>(10);

    public SystemLogServiceImpll(){
        init();
    }

    public void init(){
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(new Consumer());
        service.submit(new Consumer());
        service.submit(new Consumer());
        service.submit(new Consumer());
        service.submit(new Consumer());
    }

    public void save(SystemLog systemLog) {
        try {
            queue.put(systemLog);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Consumer implements Runnable {
        public void run() {

            while (true) {
                try {
                    SystemLog log = queue.take();
                    Thread.sleep(500);
                    loger.info(log);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
