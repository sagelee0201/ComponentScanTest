package my.beam.demo.annotationconfig;

import lombok.extern.slf4j.Slf4j;
import my.beam.demo.component.beans.ComponentBeanA;
import my.beam.demo.component.beans.ComponentBeanB;
import my.beam.demo.component.beans.ComponentBeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ComponentConfig {
    @Bean
    public ComponentBeanA componentBeanA(){
        log.info("Application Context에서 ComponentBeanA 생성 중");
        return new ComponentBeanA(componentBeanC());
    }
    @Bean
    public ComponentBeanB componentBeanB(){
        log.info("Application Context에서 ComponentBeanB 생성 중");
        return new ComponentBeanB(componentBeanC());
    }
    @Bean
    public ComponentBeanC componentBeanC(){
        log.info("Application Context에서 ComponentBeanC 생성 중");
        return new ComponentBeanC();
    }
}