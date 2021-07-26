package my.beam.demo.annotationconfig;

import lombok.extern.slf4j.Slf4j;
import my.beam.demo.annotationconfig.beans.AnnotationBeanA;
import my.beam.demo.annotationconfig.beans.AnnotationBeanB;
import my.beam.demo.annotationconfig.beans.AnnotationBeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AnnotationConfig {
    @Bean
    public AnnotationBeanA annotationBeanA(){
        log.info("Application Context에서 AnnotationBeanA 생성 중");
        return new AnnotationBeanA(annotationBeanC());
    }
    @Bean
    public AnnotationBeanB annotationBeanB(){
        log.info("Application Context에서 AnnotationBeanB 생성 중");
        return new AnnotationBeanB(annotationBeanC());
    }
    @Bean
    public AnnotationBeanC annotationBeanC(){
        log.info("Application Context에서 AnnotationBeanC 생성 중");
        return new AnnotationBeanC();
    }
}
