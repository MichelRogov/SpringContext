package context;

import context.POJO.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringContextApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringContextApp.class, args);
//        ApplicationContext context = new FileSystemXmlApplicationContext
//                ("/src/main/resources/xmlContext.xml");
        System.out.println("Bean names: " +
                Arrays.toString(context.getBeanNamesForType(Employee.class)));

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        Company company = context.getBean(Company.class);
        System.out.println(company);

         MyXmlList myXmlList = context.getBean(MyXmlList.class);
         myXmlList.printList();

        ListClass1 listClass1 = (ListClass1) context.getBean("getListClass1");
        System.out.println(listClass1);

        MyJavaList myJavaList = context.getBean(MyJavaList.class);
        myJavaList.printer();

        String[] namesForType = context.getBeanNamesForType(ListClass1.class);
        System.out.println(Arrays.toString(namesForType));
    }
}
