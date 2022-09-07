package test1;

public class APen implements Pen {

    @Override
    public void write() {
        System.out.println("Apen write");
    }

    @Override
    public void paint() {
        System.out.println("Apen paint");
    }
}
