package genericspack;

class Box {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}


class  Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key , V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}

public class Genricstud1 {
    public static void main(String[] args) {
     Box ak = new Box();
//     ak.setValue(11);
//        System.out.println(ak.getValue());

        Pair<String, Integer> pair = new Pair<>("Arjun", 98);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
