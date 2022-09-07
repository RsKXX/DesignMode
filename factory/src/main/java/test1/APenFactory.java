package test1;

public class APenFactory implements PenFactory{
    @Override
    public Pen getInstance() {
        return new APen();
    }
}
