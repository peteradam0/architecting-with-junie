---
marp: true
theme: default
paginate: true
backgroundColor: #f4f4f4
---

# 🤖 Welcome to Junie
## Spring Boot AI Native Development in 2026

---

## 🤖 What is Junie?

- **An Agent, Not a Chatbot:** Think of Junie as a digital teammate living inside IntelliJ. While a chatbot just *talks* about code, Junie **takes action**—it creates files, runs builds, and executes complex missions autonomously.

- **"Hungry for Context":** Junie’s abilities are directly tied to what you let it "see."
    * **Without Context:** It can draft a generic solution, but it won't know any specifics of the project.
    * **With Context:** It’s a local expert. It respects your project’s unique architecture guidelines and best practices.
---

## 🔍 Understanding "Context"
*How Junie sees your project differently than a browser:*

- **The `@projectStructure` Symbol:** Can be used as a snapshot of the whole project skeleton so Junie can understand the project's structure. 
- **Semantic Search:** It doesn't just search for keywords; it understands the *relationships* between your Classes, Interfaces, and Records.
- **Implicit Context:** Junie knows which file you have opened, where your cursor is, and what compilation errors are currently visible.
- **Blueprint Awareness:** There is a possibility to create a `architecture.md` that can be used at every beginning of a task.

---

## 🧠 The IntelliJ "Unfair Advantage"

- **Refactoring Safety:** When Junie renames a method, it uses IntelliJ's **Refactor engine**. It updates every single reference across the whole project, so your code never breaks.
- **Debugger Synergy:** Stuck on a bug? Junie can analyze the **Variable State** during a debug session to tell you exactly why a value is `null`.
- **Local Indexing:** Junie uses the same index IntelliJ uses for "Search Everywhere." It finds your code 10x faster and more accurately than external plugins.

---

## The Workflow: Think → Code
1. **Ask Mode (Planning):** Brainstorm without changing files.
2. **Code Mode (Execution):** Junie writes the multi-file changes for you.
    - It provides a **plan** first—you approve it before it touches the code.
3. **Review:** Use IntelliJ's "Diff View" to see exactly what Junie changed.

---

---

## 🕹️ Command & Control: Slash Commands
*Commands that tell Junie exactly what mode to operate in.*

- **`/plan`**: Force Junie to stop and think. It will output a step-by-step strategy without writing code. Great for double-checking logic before "breaking ground."
- **`/code`**: The execution command. Tells Junie to stop talking and start modifying files based on the current discussion.
- **`/status`**: Check on Junie’s progress during long tasks. It shows you what it has completed and what is left in its "Mission Log."
- **`/token`**: Shows your "Context Budget." It helps you see how much of the project Junie is currently "holding in its head."

---

## ⚙️ The Engine: Behind the Scenes
*Junie does heavy lifting to keep the conversation smart.*

- **Context Compression:** Junie is smart enough to summarize long files. It doesn't read every single line of a 1,000-line file unless it needs to; it "compresses" the fluff to stay focused on the logic.
- **Context Cleaning:** As you chat, Junie throws away irrelevant information from 20 prompts ago so it doesn't get confused by "old" ideas.
- **Token Management:** It prioritizes the most important files (like your Blueprint and Open Tabs) to stay within the AI's "memory limit."

---

---

## 🧠 Managing Junie’s Memory
*How to keep your Agent sharp after 50 prompts.*

- **Automatic Compression:** Junie "shrinks" old parts of the chat to keep the focus on what you’re doing **right now**.
- **The "New Chat" Reset:** If Junie starts getting confused, start a new chat. It’s like giving the AI a fresh cup of coffee and a clean desk.
- **Manual Focus:** Close unused IntelliJ tabs. Junie "looks over your shoulder"—if a file is closed, it’s less likely to influence the next answer.

---

---

## 📂 Organizing the Brain: Role-Based Rules
*Don't just have rules; have a hierarchy.*

- **Path:** `.aiassistant/rules/roles/architect.md`
- **Why use Sub-folders?**
    - **Clarity:** Separates "Architectural Laws" from "Style Preferences."
    - **Scalability:** As the team grows, you can add `devops.md` or `security.md` without making the main rules file unreadable.
- **How to Summon:** - Use **@rule:roles/architect** in the chat to force the AI into Architect mode for a specific task.
    - Or set it to **"Always"** in settings to ensure every line of code follows the master plan.

---


