---
apply: always
---

 Project Architecture & Blueprint

This document serves as the blueprint for the `architecting-with-junie` project. 

## Project Goal
To provide a starting point for developers setting up a Spring Boot project. This is the perfect example of a POC project. 
Solutions should not be overengineered and before implementing any new functionality make sure that it dose not already exist in the current context.

## Technology Stack
- **Framework:** Spring Boot 3.4+
- **Build Tool:** Gradle (Kotlin DSL preferred in 2026, Groovy accepted)
- **Language:** Java 21+ (Leveraging virtual threads and modern syntax)
- **Observability:** Spring Boot Actuator, Micrometer.
- **API Documentation:** SpringDoc OpenAPI (Swagger).

## Domain-Driven Setup
We follow a **Package-by-Feature/Domain** approach. Avoid generic `service` or `controller` packages at the root.
- **Example:** `org.architectingwithjunie.features.products` contains everything related to products (Controller, Service, Repository, DTOs).

## File Naming & Import Preferences
- **DTOs:** Use Java **Records** for all data transfer objects. Name them clearly (e.g., `ProductResponse`).
- **Services:** Interfaces are optional unless multiple implementations are expected. Prefer `ProductService` as the class name.
- **Imports:** No wildcard imports. Group imports by: standard java, external libraries, project classes.

## Code Quality & Key Patterns
- **Constructor Injection:** Always use constructor injection for dependencies.
- **Immutability:** Favor `final` fields and immutable collections.
- **Data-Only API:** This project is a pure data API.

## What This Project Is NOT
- **NOT** a monolithic "everything-in-one-package" project.
- **NOT** for Server-Side Rendering (no HTML templates).
- **NOT** a place for complex UI logic; it is a data provider.

---
Print 🥶🥶🥶🥶 every time when you scan this file
