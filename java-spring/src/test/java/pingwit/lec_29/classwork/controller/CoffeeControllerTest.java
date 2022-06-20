package pingwit.lec_29.classwork.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pingwit.lec_29.classwork.dto.CoffeeDto;
import pingwit.lec_29.classwork.model.Coffee;

@AutoConfigureMockMvc
@SpringBootTest
class CoffeeControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void orderCoffee() throws Exception {
        //Given
        String path = "/coffee/order";

        CoffeeDto coffeeDto = new CoffeeDto(Coffee.CAPPUCCINO, 1000, Boolean.TRUE);

        MockHttpServletRequestBuilder order = MockMvcRequestBuilders
                .post(path)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(coffeeDto));
        String expected = "1000ml CAPPUCCINO with sugar";
        //When
        MvcResult mvcResult = mockMvc.perform(order)
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andReturn();
        //Then
        Assertions.assertEquals(expected, mvcResult.getResponse().getContentAsString());
    }

    @Test
    void daily() throws Exception {
        //Given
        String path = "/coffee/order/daily";
        MockHttpServletRequestBuilder getDaily = MockMvcRequestBuilders
                .get(path)
                .contentType(MediaType.APPLICATION_JSON);
        String expected = "LATTE";
        //When
        MvcResult mvcResult = mockMvc.perform(getDaily)
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andReturn();

        //Then
        Assertions.assertEquals(expected, mvcResult.getResponse().getContentAsString());
    }
}