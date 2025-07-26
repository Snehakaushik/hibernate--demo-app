# Hibernate Demo 🚀

A simple Java + Hibernate project demonstrating basic CRUD operations and second-level caching with EhCache.

## 🔧 Tech Stack
- Java 21
- Hibernate ORM
- MySQL
- Maven
- EhCache

## 📁 Structure
- `Alien.java` – Entity class
- `Main.java` – CRUD operations using `Session`
- `hibernate.cfg.xml` – Hibernate config (DB + cache)

## ⚙️ Features
- Annotation-based Hibernate setup
- Custom table/column names
- `SessionFactory`, `Transaction`, `persist()`, `find()`
- Lazy vs Eager fetching
- EhCache (2nd-level caching)

## 🏁 How to Run
1. Configure DB in `hibernate.cfg.xml`
2. Build: `mvn clean install`
3. Run: Execute `Main.java`

---

Made with ❤️ by [Sneha](https://github.com/Snehakaushik)
