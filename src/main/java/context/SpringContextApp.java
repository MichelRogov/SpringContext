package context;

import context.POJO.Company;
import context.POJO.Employee;
import context.POJO.MyXmlList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringContextApp {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(SpringContextApp.class, args);
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("/src/main/resources/xmlContext.xml");
        System.out.println("Bean names: " +
                Arrays.toString(context.getBeanNamesForType(Employee.class)));

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        Company company = context.getBean(Company.class);
        System.out.println(company);

         MyXmlList myXmlList = (MyXmlList) context.getBean("MyXmlList");
         myXmlList.printList();
    }
}
