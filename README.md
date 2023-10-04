# Simple Java-Hibernate example using MySQL database!

## 1. Start the database

In the project directory, run this to build a container that run Mysql:

```bash
docker-compose up -d
```

This will run Mysql at https://localhost:3306.

2. Install and compile Maven project

Run this:

```bash
mvn clean install
```

Then:

```bash
mvn compile
```

## 3. Run the project

Change "vn.edu.tdtu.Program" to the path to your main class.

```bash
mvn exec:java -Dexec.mainClass="vn.edu.tdtu.Program"
```