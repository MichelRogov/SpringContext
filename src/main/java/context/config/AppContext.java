package context.config;

import context.POJO.ListClass1;
import context.POJO.MyJavaList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("xmlContext.xml")

public class AppContext {

    @Bean
    public ListClass1 getListClass1() {
        return new ListClass1();
    }

    @Bean
    public MyJavaList getMyJavaList() {
        return new MyJavaList();
    }
}
