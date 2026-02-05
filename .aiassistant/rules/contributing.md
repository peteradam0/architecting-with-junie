---
apply: always
---

# Contributing to the Blueprint

Thank you for contributing to this enterprise blueprint! This project is designed for AI-augmented development with Junie.

## Development Workflow
1. **Initialize**: Ensure you have the AI Assistant plugin installed.
2. **Consult the Blueprint**: Read `.aiassistant/rules/architecture.md` before making changes.
3. **Collaboration with Junie**:
   - Use `@projectStructure` to orient Junie.
   - Junie follows the rules in `.aiassistant/rules/` automatically.
4. **Testing**: Always run tests before submitting.
   - `./gradlew test`

## Coding Standards (2026 Edition)
- **Domain-Driven**: Group code by feature (e.g., `features.products`).
- **Modern Java**: Use Records for DTOs, Pattern Matching, and Virtual Threads where applicable.
- **Clean Code**: Meaningful names, small methods, and constructor injection are mandatory.
- **Data Only**: No HTML or SSR. All endpoints must return raw data (JSON).

## Documentation
- Keep the `architecture.md` blueprint updated if you introduce new patterns.
- Ensure all new features are reflected in the OpenAPI (Swagger) documentation.
