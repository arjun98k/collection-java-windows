package OOPS1;
class omkar{
    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

 class Oop1 {


    public static void main(String[] args) {

        omkar obj = new omkar();
        obj.setName("amita");
        System.out.println( obj.getName());

    }
}


