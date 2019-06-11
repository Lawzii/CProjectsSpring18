public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public <E extends Number> Double power(E var){
        return var.doubleValue() * var.doubleValue();
    }
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for(Number n  : list){
            s += n.doubleValue();
        return s;
        }
    }
  }