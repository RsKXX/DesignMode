package test1;

public class Test {
    public static void main(String[] args) {
        Pen bPen = new BPenFactory().getInstance();
        bPen.paint();

        Pen aPen = new APenFactory().getInstance();
        aPen.paint();
        aPen.write();
    }
}
