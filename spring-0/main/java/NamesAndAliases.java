import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class NamesAndAliases {

     @Test
     public void test() {
          ApplicationContext c = new ClassPathXmlApplicationContext("ctx-1.xml");

          assertNotNull(c.getBean("beanID"));
          assertNotNull(c.getBean("name2"));
          assertNotNull(c.getBean("beanID1"));
          assertNotNull(c.getBean("beanID2"));
     }



}

