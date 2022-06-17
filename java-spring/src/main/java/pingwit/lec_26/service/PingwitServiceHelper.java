package pingwit.lec_26.service;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.util.stream.Stream;

@Component
public class PingwitServiceHelper {

    public String[] getNullPropertyNames(Object source) {
        BeanWrapper src = new BeanWrapperImpl(source);

        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        return Stream.of(pds)
                .map(PropertyDescriptor::getName)
                .filter(name -> src.getPropertyValue(name) == null)
                .toArray(String[]::new);
    }
}
