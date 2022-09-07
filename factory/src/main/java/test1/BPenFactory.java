package test1;

public class BPenFactory implements PenFactory{
    @Override
    public Pen getInstance() {
        return new BPen();
    }
}
