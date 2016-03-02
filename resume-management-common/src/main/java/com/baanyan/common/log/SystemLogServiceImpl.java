package com.baanyan.common.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Created by steve on 3/2/16.
 */
@Service
public class SystemLogServiceImpl implements SystemLogService {

    Log log = LogFactory.getLog(SystemLogServiceImpl.class);

    private BlockingQueue<SystemLog> queue = new LinkedBlockingQueue(10);

    public SystemLogServiceImpl(){
        init();
    }

    public void save(SystemLog systemLog) {
        log.info(systemLog);
        try {
            queue.put(systemLog);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void init() {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Consumer());
        service.submit(new Consumer());
        service.submit(new Consumer());
        service.submit(new Consumer());
        service.submit(new Consumer());
        service.submit(new Consumer());
    }

    class Consumer implements Runnable {
        private void consume() {
            while (true) {
                try {
                    SystemLog systemLog = queue.take();
                    // insert into database
                    Thread.sleep(500);
                    log.info(systemLog);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void run() {
            consume();
        }
    }


}
