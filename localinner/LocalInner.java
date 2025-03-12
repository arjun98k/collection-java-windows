package localinner;

public class LocalInner {

    void methodouter(){

        class  Innerlocal {
            void showmsg(){
                System.out.println("i am method of  inside inner class");
            }


        }
        Innerlocal obj1 = new Innerlocal();
        obj1.showmsg();
    }

    public static void main(String[] args) {
    LocalInner obj = new LocalInner();
    obj.methodouter();
    }
}
