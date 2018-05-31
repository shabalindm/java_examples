package simple;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class NamesAndAliases {

     @Test
     public void test() {
          ApplicationContext c = new ClassPathXmlApplicationContext("simple/namesAndAliases.xml");

          assertNotNull(c.getBean("beanID"));
          assertNotNull(c.getBean("name2"));
          assertNotNull(c.getBean("beanID1"));
          assertNotNull(c.getBean("beanID2"));
     }



}

