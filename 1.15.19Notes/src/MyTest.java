public class MyTest{


    private String name;

    MyTest (){
        System.out.println ("Create a blank Object");
    }

    MyTest (int age){
        System.out.println ("Object with age");
    }

    MyTest (String name) {
        System.out.println("Object with a name") ;
        this.name = name;
    }

    public int sum (int a, int b)
    {
        return a + b;
    }

    public double sum (double a, double b){

        return a + b;
    }
    public float sum (float a, float b){

        return a + b ;
    }

    public String getName(){

        return name;
    }
}
