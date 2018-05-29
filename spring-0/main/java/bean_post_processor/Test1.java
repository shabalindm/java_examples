package bean_post_processor;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

    @Test
    public void smoke() throws Exception {
        ApplicationContext c = new ClassPathXmlApplicationContext("bean_post_processor/ctx.xml");
    }
}
