package context.POJO;

public class ListClass2 implements ListClass, AutowireList {
    @Override
    public void getName() {
        System.out.println("ListClass 2");
    }
}
