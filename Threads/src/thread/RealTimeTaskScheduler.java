package thread;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RealTimeTaskScheduler {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Submitting tasks with different deadlines
        scheduler.schedule(new RealTimeTask("Task 1",scheduler), 0, TimeUnit.SECONDS);
        scheduler.schedule(new RealTimeTask("Task 2",scheduler), 1, TimeUnit.SECONDS);
        scheduler.schedule(new RealTimeTask("Task 3",scheduler), 3, TimeUnit.SECONDS);
  //      System.out.println("Terminated="+scheduler.isTerminated()+ " at " + System.currentTimeMillis());

    }

    static class RealTimeTask implements Runnable {
        private final String taskName;
        ScheduledExecutorService scheduler;
        public RealTimeTask(String taskName,   ScheduledExecutorService scheduler) {
            this.taskName = taskName;
           this.scheduler=scheduler;
        }

        @Override
        public void run() {
//            System.out.println("Executing " + taskName+"Terminated="+scheduler.isTerminated() + " at " + new Date().getSeconds());

            // Simulating task execution
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

         
        }
    }
}
