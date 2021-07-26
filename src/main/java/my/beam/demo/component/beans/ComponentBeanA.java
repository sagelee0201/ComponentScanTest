package my.beam.demo.component.beans;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ComponentBeanA {
    private final ComponentBeanC componentBeanC;

    public ComponentBeanA(ComponentBeanC componentBeanC) {
        log.info("componentBeanA 인스턴스 생성 중");
        this.componentBeanC = componentBeanC;
    }
}
