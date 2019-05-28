public class ThreadFun{
    public static void main (String[] args){
        CarThread car = new CarThread();
        Running r = new Running();
        Thread bunny = new Thread(r);

        car.setName("Ferrari");
        bunny.setName("Peter");

        car.start();
        bunny.start();
    }
}