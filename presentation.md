---
marp: true
theme: default
paginate: true
backgroundColor: #f4f4f4
---

# 🤖 Welcome to Junie
### Pair Programming in 2026
**Presenter:** [Your Name]
**Project:** Simple Spring Boot Webserver

---

## What is Junie?
- **Not a Chatbot:** It's an AI *Agent*.
- **Integrated:** It knows your `@projectStructure`.
- **Action-Oriented:** It can create files, run `./mvnw`, and fix bugs.

---

## The Workflow: Think → Code
1. **Ask Mode (Planning):** Brainstorm architecture.
2. **Code Mode (Execution):** Junie writes the multi-file changes.
3. **Review:** You approve the diffs.

---

## Demo: Starting From Zero
- Open the AI Sidebar.
- **Prompt:** `"@projectStructure I want to build a simple /ping endpoint. What is the best package structure for this?"`
- *Observation:* Note how it reads our existing files before answering.

---

## Rule-Based Development
Check the `.aiassistant/rules/` folder:
- **Style:** "Use Records for DTOs."
- **Architecture:** "Logic stays in Services."
- *Junie follows these rules automatically!*

---

## Troubleshooting & Self-Healing
- If the build fails:
- Click **"Explain with AI"** in the Terminal.
- Junie will analyze the stack trace and offer a one-click fix.

---

## Summary & Next Steps
- [ ] Install AI Assistant Plugin.
- [ ] Clone this repo.
- [ ] Ask Junie: *"Create a basic GreetingService."*