public class CarThread extends Thread{

    public void run (){
        
        try{
            ts.zoom();
        } catch(Exception e){ 
                System.out.println("Car interrupted");
        
            }
            System.out.println("Car is done");
}
}