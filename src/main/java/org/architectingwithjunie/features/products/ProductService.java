package org.architectingwithjunie.features.products;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        return List.of(
            new Product(UUID.randomUUID(), "AI Developer Pro", "Advanced AI assistant for coding", new BigDecimal("49.99")),
            new Product(UUID.randomUUID(), "Spring Boot Blueprint", "Comprehensive guide to enterprise Spring Boot", new BigDecimal("29.99")),
            new Product(UUID.randomUUID(), "Junie Mascot", "A small plushie of our favorite agent", new BigDecimal("19.99"))
        );
    }
}
