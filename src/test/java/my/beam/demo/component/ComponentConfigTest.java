package my.beam.demo.component;

import my.beam.demo.annotationconfig.ComponentConfig;
import my.beam.demo.component.beans.ComponentBeanA;
import my.beam.demo.component.beans.ComponentBeanB;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ComponentConfigTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ComponentConfig.class);

    @Test
    public void printAllBeans(){
        Arrays.stream(ac.getBeanDefinitionNames()).forEach(name -> System.out.println(ac.getBean(name).getClass()));
        Assertions.assertThat(ac.getBean(ComponentBeanA.class).getComponentBeanC()).isNotSameAs(ac.getBean(ComponentBeanB.class).getComponentBeanC());
    }
}