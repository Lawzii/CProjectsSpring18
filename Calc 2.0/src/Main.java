public class Main {

    public static void main(String[] args) {

        //create calculator
        //mult 5 x 2
        //div 10 / 2
        //add 48 + 94
        //subtract 100 - 34
        //print name of calculator

        Calculator mc3 = new Calculator("Calculator");

        System.out.println(mc3.getName());
        System.out.print(mc3.sum(48, 94));
        System.out.println(mc3.subtraction(100,34));
        System.out.println(mc3.division(10, 2));
        System.out.println(mc3.mult(5, 2));

    }
}
