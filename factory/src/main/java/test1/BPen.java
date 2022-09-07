package test1;

public class BPen implements Pen {

    @Override
    public void write() {
        System.out.println("Bpen write");
    }

    @Override
    public void paint() {
        System.out.println("Bpen paint");
    }
}
