package test2;

public class Test {
    public static void main(String[] args) {
        AFactory aFactory = new AFactory();
        aFactory.createBook().read();

        BFactory bFactory = new BFactory();
        bFactory.createBook().read();
    }
}
