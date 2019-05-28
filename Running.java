public class Running implements Runnable{

    ThreadStuff ts = new ThreadStuff();

    public void run (){
            try{
                ts.eat();
            } catch(Exception e){
                    System.out.println("bunny interrupted");
            
                }
                System.out.println("Bunny is done");
            }
    }
