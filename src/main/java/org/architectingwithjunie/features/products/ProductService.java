package org.architectingwithjunie.features.products;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final List<Product> products = List.of(
        new Product(UUID.fromString("11111111-1111-1111-1111-111111111111"), "AI Developer Pro", "Advanced AI assistant for coding", new BigDecimal("49.99")),
        new Product(UUID.fromString("22222222-2222-2222-2222-222222222222"), "Spring Boot Blueprint", "Comprehensive guide to enterprise Spring Boot", new BigDecimal("29.99")),
        new Product(UUID.fromString("33333333-3333-3333-3333-333333333333"), "Junie Mascot", "A small plushie of our favorite agent", new BigDecimal("19.99"))
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> findById(UUID id) {
        return products.stream().filter(p -> p.id().equals(id)).findFirst();
    }
}
