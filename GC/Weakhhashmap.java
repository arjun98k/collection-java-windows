package GC;


import java.util.WeakHashMap;

class Image {
    private String name;


    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Weakhhashmap {
    public static void main(String[] args) {
        WeakHashMap<String,Image> iamgecache = new WeakHashMap<>();
        iamgecache.put("img1",new Image("Image1"));
        iamgecache.put("img2",new Image("Image2"));
        System.out.println(iamgecache);
        System.gc();
        simulateApplicationRunning();

        System.out.println(iamgecache);

    }
    private static void simulateApplicationRunning(){
        try {
            System.out.println("some thing simulate");
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
