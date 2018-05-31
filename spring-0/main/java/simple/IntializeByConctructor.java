package simple;

import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IntializeByConctructor {

    @Test
    public void smoke() throws Exception {
        ApplicationContext c = new ClassPathXmlApplicationContext("simple/intializeByConctructor.xml");
    }

    public static class A {



    }

    public static class B {



    }

    public static class C {

        private final A a;
        private final B b;

        public C(B b, A a) {
            this.a = a;
            this.b = b;
        }
    }
}
