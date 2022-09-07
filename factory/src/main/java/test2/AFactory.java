package test2;

public class AFactory implements IFactory{
    @Override
    public Book createBook() {
        return new ABook();
    }

    @Override
    public Backpack createBackpack() {
        return new ABackpack();
    }
}
