public class ThreadStuff {

    public synchronized void zoom() throws InterruptedException{
        System.out.println("Car is driving fast");
       wait(); // could surround with a try/catch but 'throws InterruptedException' replaces it
    /*
        wait will suspend itself until woken up with notify(); in the other thread
        could also use wait(3000); uses milliseconds vs sleep(); in other threads
        sleep(); takes on a time variable as well, so wait and notify work better than guessing the amount of time for a process to carry out
    */
        System.out.println("Resumed");
    }

    public void eat() throws InterruptedException{

        synchronized (this){
        Thread.sleep(10000);
        System.out.println("Bunny is eating");
        notify(); // notify will ping whichever thread is next in the queue; if multiple threads you can use notifyAll();
        }
    }
}
