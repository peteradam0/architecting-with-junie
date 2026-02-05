---
apply: always
---

# Project Architecture & Blueprint

This document serves as the **Gold Standard** and blueprint for the `architecting-with-junie` project. It defines the goal, tech stack, and patterns that both humans and Junie (the AI Agent) must follow.

## Project Goal
To provide a rock-solid, enterprise-ready starting point for developers setting up a Spring Boot project from zero in 2026. This blueprint prioritizes observability, domain-driven design, and AI-augmented development.

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
- **Data-Only API:** This project is a pure data API. **No Server-Side Rendering (SSR)** or markup (Thymeleaf, etc.) is allowed.
- **Response Format:** Prefer JSON. Not strictly tied to REST; can use other data protocols as needed.
- **Error Handling:** Use `ProblemDetail` (RFC 9457) for consistent error responses.

## What This Project Is NOT
- **NOT** a monolithic "everything-in-one-package" project.
- **NOT** for Server-Side Rendering (no HTML templates).
- **NOT** a place for complex UI logic; it is a data provider.

---
*Note: This blueprint is a template and should be overridden by project-specific requirements as the application evolves.*
