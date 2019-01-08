package context.POJO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyJavaList {

    @Autowired
    private AutowireList autowireList;

    @Autowired
    private List<ListClass> list;

    public MyJavaList() {
    }

    public void printer() {
        System.out.println("===== myJavaList printer =====");
        autowireList.getName();
        System.out.println("==============================");
        list.forEach(ListClass::getName);
    }
}
