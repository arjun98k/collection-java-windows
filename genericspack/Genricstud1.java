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

public class Genricstud1 {
    public static void main(String[] args) {
     Box ak = new Box();
     ak.setValue(11);
        System.out.println(ak.getValue());
    }
}
