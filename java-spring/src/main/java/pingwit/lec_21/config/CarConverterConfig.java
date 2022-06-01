package pingwit.lec_21.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pingwit.lec_21.converter.CarDtoConverter;
import pingwit.lec_21.converter.UserConverter;

@Configuration

public class CarConverterConfig {

    @Bean
    public CarDtoConverter carDtoConverter(UserConverter userConverter){
        return new CarDtoConverter(userConverter);
    }
}
