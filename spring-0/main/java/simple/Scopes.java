package simple;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class Scopes {

    public static class Singleton {
          private final Prototype prototype;

          Singleton(Prototype prototype) {
               this.prototype = prototype;
          }

          public Prototype getPrototype() {
               return prototype;
          }
     }

     public static class Prototype{

          public int getID(){
               return hashCode();
          }

     }

     ApplicationContext c = new ClassPathXmlApplicationContext("simple/scopes.xml");

     @Test
     public void test1() {
          System.out.println(getProtoId(c, "singleton1"));
          System.out.println(getProtoId(c, "singleton1"));
     }

     @Test
     public void test2() {
          System.out.println(getProtoId(c, "singleton2"));
          System.out.println(getProtoId(c, "singleton2"));
     }


     private int getProtoId(ApplicationContext c, String beanName) {
          return ((Singleton)c.getBean(beanName)).getPrototype().getID();
     }


}
