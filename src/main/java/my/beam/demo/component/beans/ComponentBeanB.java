package my.beam.demo.component.beans;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ComponentBeanB {
    private final ComponentBeanC componentBeanC;

    public ComponentBeanB(ComponentBeanC componentBeanC) {
        log.info("componentBeanB 인스턴스 생성 중");
        this.componentBeanC = componentBeanC;
    }
}
