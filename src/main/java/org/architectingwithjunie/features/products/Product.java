package org.architectingwithjunie.features.products;

import java.math.BigDecimal;
import java.util.UUID;

public record Product(UUID id, String name, String description, BigDecimal price) {
}
