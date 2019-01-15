public class Calculator {

    //constructor that names your calc
    //var for name
    //return name

    //addition
    //subtract
    //division
    //multiply
    private String name;

    Calculator (String name ){
        this.name = name;
    }

    public int sum (int a, int b){
        return a + b;
    }

    public int subtraction (int a, int b){
        return a - b;
    }

    public double division (double a, double b){
        return a / b;
    }
    public int mult(int a, int b){

        return a * b ;
    }

    public String getName(){
        return name ;
    }
}
