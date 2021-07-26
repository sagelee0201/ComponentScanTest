package my.beam.demo.annotationconfig.beans;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class AnnotationBeanB {
    private final AnnotationBeanC annotationBeanC;
    public AnnotationBeanB(AnnotationBeanC annotationBeanC){
        log.info("AnnotationBeanB 인스턴스 생성 중");
        this.annotationBeanC = annotationBeanC;
    }
}
