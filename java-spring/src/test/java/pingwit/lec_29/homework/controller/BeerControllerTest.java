package pingwit.lec_29.homework.controller;

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
import pingwit.lec_29.homework.dto.BeerDto;
import pingwit.lec_29.homework.menu.Beer;

@AutoConfigureMockMvc
@SpringBootTest
class BeerControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void orderBeer() throws Exception {
        //Given
        String path = "/beer/order";

        BeerDto beerDto = new BeerDto(Beer.KELLERBIER, 1000, 10);

        MockHttpServletRequestBuilder order = MockMvcRequestBuilders
                .post(path)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(beerDto));
        //When
        MvcResult mvcResult = mockMvc.perform(order)
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andReturn();
        String expected = "1000ml KELLERBIER 10"; // String expected должен быть в секции //Given
        //Then
        Assertions.assertEquals(expected, mvcResult.getResponse().getContentAsString());
    }
}
