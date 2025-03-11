package outerclass2;

public class StaticInner {
static  int statvar = 98;

static class StaticNestedclass {
    void display(){
        System.out.println("static nested class" +" " + statvar);
    }
}

    public static void main(String[] args) {
        StaticInner.StaticNestedclass obj = new StaticInner.StaticNestedclass();
        obj.display();
    }
}
