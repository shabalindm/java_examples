package simple;


import org.junit.Test;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class InstantiationTracingBeanPostProcessor implements BeanPostProcessor{

    public static class PostProcessor {

        // simply return the instantiated bean as-is
        public Object postProcessBeforeInitialization(Object bean, String beanName) {
            return bean; // we could potentially return any object reference here...
        }

        public Object postProcessAfterInitialization(Object bean, String beanName) {
            System.out.println("Bean '" + beanName + "' created : " + bean.toString());
            return bean;
        }
    }


    @Test
    public void smoke() throws Exception {
        ApplicationContext c = new ClassPathXmlApplicationContext("simple/instantiationTracingBeanPostProcessor.xml");
    }
}