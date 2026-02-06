package org.architectingwithjunie.features.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ProductService productService;

    @Test
    void shouldReturnListOfProducts() throws Exception {
        List<Product> products = List.of(
            new Product(UUID.randomUUID(), "Test Product", "Description", new BigDecimal("10.00"))
        );
        when(productService.getAllProducts()).thenReturn(products);

        mockMvc.perform(get("/api/products"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.length()").value(1))
            .andExpect(jsonPath("$[0].name").value("Test Product"));
    }

    @Test
    void shouldReturnProductDetails() throws Exception {
        UUID id = UUID.randomUUID();
        Product product = new Product(id, "Detail Product", "Detail Description", new BigDecimal("15.50"));
        when(productService.findById(id)).thenReturn(Optional.of(product));

        mockMvc.perform(get("/api/products/" + id))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id").value(id.toString()))
            .andExpect(jsonPath("$.name").value("Detail Product"))
            .andExpect(jsonPath("$.price").value(15.50));
    }

    @Test
    void shouldReturn404WhenProductNotFound() throws Exception {
        UUID id = UUID.randomUUID();
        when(productService.findById(id)).thenReturn(Optional.empty());

        mockMvc.perform(get("/api/products/" + id))
            .andExpect(status().isNotFound());
    }
}
