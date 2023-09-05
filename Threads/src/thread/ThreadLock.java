package thread;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.locks.ReentrantLock;  
// create workerThread class for implementing the runnable worker thread  
class workerThread implements Runnable  
{  
    String name;  
    ReentrantLock lock;  
    // workerThread class constructor  
    public workerThread(ReentrantLock lock, String name)  
    {  
        this.lock = lock;       
        this.name = name;  
    }  
    // run() method provided by Runnable interface  
    public void run()  
    {  
        boolean execution = false;  
        while (!execution)  
        {  
            //get outer lock using tryLock() method  
            boolean result = lock.tryLock();  
            // the tryLock() method returns true when the lock is free  
            if(result)  
            {  
                // try section of outer lock  
                try  
                {  
                    // create instance of Date class  
                    Date dateObj = new Date();  
                    // convert dateObj into required format using SimpleDateFormat class   
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");  
                    System.out.println("Task : "+ name + " outer lock is acquired at "+ sdf.format(dateObj));  
                    // use sleep() method of Thread class  
                    Thread.sleep(1500);  
                    // get inner lock using lock() method  
                    lock.lock();  
                    // try section of inner lock  
                    try  
                    {  
                        dateObj = new Date();  
                        sdf = new SimpleDateFormat("hh:mm:ss");  
                        System.out.println("Task : "+ name+ " inner lock is acquired at "+ sdf.format(dateObj));  
// use getHoldCount() method to get lock hold count of inner lock  
System.out.println("The lock hold count of inner lock: "+ lock.getHoldCount());  
                          
                        // use sleep() method of the thread class  
                        Thread.sleep(1500);  
                    }  
                      
                    // catch block for handling inner lock exceptions  
                    catch(InterruptedException e)  
                    {  
                        e.printStackTrace();  
                    }  
                    // finally block for releasing the inner lock  
                    finally  
                    {  
                        //inner lock release  
                        System.out.println("The inner lock is released by task : " + name);  
                        lock.unlock();  
                    }  
                      
                    // use getHoldCount() method to get lock hold count of inner lock  
                    System.out.println("The lock hold count of inner lock: " + lock.getHoldCount());  
                    System.out.println("The work of the " + name + " task is done");  
                    // set result to true  
                    result = true;  
                }  
                // catch block for handling outer lock exceptions  
                catch(InterruptedException e)  
                {  
                    e.printStackTrace();  
                }  
                // finally block for releasing the outer lock  
                finally  
                {  
                    //Outer lock release  
                    System.out.println("The outer lock is released by task" + name);  
                    lock.unlock();  
                    System.out.println("The lock hold count of outer lock: " + lock.getHoldCount());  
                }  
            }  
            else  
            {  
                //print that tasks waiting for lock  
                System.out.println("Task " + name +" is waiting for the lock");  
                try  
                {  
                    // use sleep method to suspend execution   
                    Thread.sleep(1000);  
                }  
                catch(InterruptedException e)  
                {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}  
public class ThreadLock  
{  
    // define final value for MAX_VAL  
    static final int MAX_VAL = 2;  
    // main() method start  
    public static void main(String[] args)  
    {  
        // create instance of the ReentrantLock  
         ReentrantLock lock = new ReentrantLock();  
         // create thread pool by using ExecutorService class  
         ExecutorService pool = Executors.newFixedThreadPool(MAX_VAL);  
         Runnable wt1 = new workerThread(lock, "Job1");  
         Runnable wt2 = new workerThread(lock, "Job2");  
         Runnable wt3 = new workerThread(lock, "Job3");  
         Runnable wt4 = new workerThread(lock, "Job4");  
         // execute jobs by using execute() method of ExecutorService  
         pool.execute(wt1);  
         pool.execute(wt2);  
         pool.execute(wt3);  
         pool.execute(wt4);  
         // shutdown pool  
         pool.shutdown();  
    }  
}  