# Prerequisites for Spring Boot Development

Before you start developing a Spring Boot application, ensure you have the following prerequisites installed and configured on your system.

## 1. Java Development Kit (JDK)
- Spring Boot requires **JDK 8 or later** (recommended: **JDK 17 or later**).
- Download and install the latest **OpenJDK** or **Oracle JDK** from:
  - [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
  - [Adoptium OpenJDK](https://adoptium.net/)

### Verify Installation:
```sh
java -version
```
You should see output similar to:
```
java version "17.0.2" 2022-01-18 LTS
Java(TM) SE Runtime Environment ...
```

## 2. Apache Maven or Gradle
Spring Boot projects typically use **Maven** or **Gradle** as the build tool.

### Install Maven:
- Download from [Maven Official Site](https://maven.apache.org/download.cgi)
- Verify Maven installation:
```sh
mvn -version
```

### Install Gradle (Optional):
- Download from [Gradle Official Site](https://gradle.org/install/)
- Verify Gradle installation:
```sh
gradle -version
```

## 3. Integrated Development Environment (IDE)
Choose an IDE that supports Spring Boot development:
- **IntelliJ IDEA (Recommended)** – [Download](https://www.jetbrains.com/idea/)
- **Eclipse IDE with Spring Tools (STS)** – [Download](https://spring.io/tools)
- **Visual Studio Code** – [Download](https://code.visualstudio.com/)

## 4. Spring Boot CLI (Optional)
Spring Boot CLI allows running Spring Boot applications quickly.
- Install using SDKMAN:
```sh
sdk install springboot
```
- Verify installation:
```sh
spring --version
```

## 5. Database (Optional for JPA Applications)
If your application interacts with a database, install one of the following:
- **PostgreSQL** – [Download](https://www.postgresql.org/download/)
- **MySQL** – [Download](https://dev.mysql.com/downloads/)
- **H2 Database (In-Memory, No Setup Needed)**

## 6. API Testing Tool (Optional)
For testing REST APIs:
- **Postman** – [Download](https://www.postman.com/downloads/)
- **cURL** (Command-line tool for API testing)

## 7. Git (Version Control)
- Install Git: [Download](https://git-scm.com/)
- Verify Git installation:
```sh
git --version
```

## 8. Docker (Optional for Containerization)
To containerize your Spring Boot application, install Docker:
- [Download Docker](https://www.docker.com/get-started)

---

### ✅ You’re Ready to Start!
Once all prerequisites are installed, you can generate a Spring Boot project using [Spring Initializr](https://start.spring.io/) and begin development. 🚀

