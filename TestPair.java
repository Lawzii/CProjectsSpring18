public class TestPair{

    public static void main(String[] args){
        Pair<Integer, String> list = new Pair<Integer, String>(42, "Rivera");
        System.out.println("The key is " + list.getKey() + " and the value is "+ list.getValue());

        System.out.println("-------");

        Pair<String, String> docket = new Pair<String, String>("Game 6", "Golden State");
        System.out.println("The key is " + docket.getKey() + " and the value is "+ docket.getValue());

        System.out.println(list.power(42));
    }
}