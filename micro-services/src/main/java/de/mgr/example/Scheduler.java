package de.mgr.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by gkatzioura on 4/26/17.
 */
@Component
public class Scheduler
{

    @Autowired
    private AsynchronousService checkAsyncService;

    @Scheduled(initialDelay = 1)
    public void checkTheScedule ()
    {
        checkAsyncService.executeAsynchronously();
    }

}