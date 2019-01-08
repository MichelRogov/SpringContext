package context.POJO;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class MyXmlList {
    private List<ListClass> list;

//    @Required
    public void setMyList(List<ListClass> myList) {
        this.list = myList;
    }

    public void printList() {
        System.out.println("======== myXmlList printer ==========");
        list.forEach(ListClass::getName);
    }
}
