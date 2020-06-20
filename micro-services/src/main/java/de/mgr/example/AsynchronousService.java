package de.mgr.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

/**
 * Created by gkatzioura on 4/26/17.
 */
@Service
public class AsynchronousService
{
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private TaskExecutor       taskExecutor;

    public void executeAsynchronously ()
    {
        taskExecutor.execute(new Runnable()
        {
            @Override
            public void run ()
            {
                try
                {
                    System.out.println(Thread.currentThread().getName() + "Runninggggg");
                    Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName() + "Stoppinggggg");
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}