package my.beam.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ComponentScanConfigTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    @Test
    public void printAllBeans(){
        Arrays.stream(ac.getBeanDefinitionNames()).forEach(name -> System.out.println(ac.getBean(name)));
    }
}