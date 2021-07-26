package my.beam.demo.annotationconfig;

import my.beam.demo.annotationconfig.beans.AnnotationBeanA;
import my.beam.demo.annotationconfig.beans.AnnotationBeanB;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationConfigTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AnnotationConfig.class);

    @Test
    public void printAllBeans(){
        Arrays.stream(ac.getBeanDefinitionNames()).forEach(name -> System.out.println(ac.getBean(name).getClass()));
        Assertions.assertThat(ac.getBean(AnnotationBeanA.class).getAnnotationBeanC()).isSameAs(ac.getBean(AnnotationBeanB.class).getAnnotationBeanC());
    }
}