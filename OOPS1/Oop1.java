package OOPS1;
class omkar{
    String name = "Arjun";

    public String getName() {
        return name;
    }
}

 class Oop1 extends omkar {


    public static void main(String[] args) {

        omkar obj = new omkar();
        System.out.println( obj.getName());

    }
}


