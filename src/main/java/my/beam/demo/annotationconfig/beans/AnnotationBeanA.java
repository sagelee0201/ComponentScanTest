package my.beam.demo.annotationconfig.beans;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class AnnotationBeanA {
    private final AnnotationBeanC annotationBeanC;
    public AnnotationBeanA(AnnotationBeanC annotationBeanC){
        log.info("AnnotationBeanA 인스턴스 생성 중");
        this.annotationBeanC = annotationBeanC;
    }
}
