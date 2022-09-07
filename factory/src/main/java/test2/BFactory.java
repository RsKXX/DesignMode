package test2;

public class BFactory implements IFactory{
    @Override
    public Book createBook() {
        return new BBook();
    }

    @Override
    public Backpack createBackpack() {
        return new BBackpack();
    }
}
