# jwt-mysql-demo

This is a ready-to-run Spring Boot 3 project demonstrating JWT authentication with Hibernate (JPA) and MySQL.

## Defaults used (you answered 'yes' so defaults were applied)
- MySQL URL: `jdbc:mysql://localhost:3306/jwt_demo`
- Username: `root`
- Password: `root`
- Hibernate ddl-auto: `update`

## How to run
1. Ensure MySQL is running and a database named `jwt_demo` exists (create it if necessary):
   ```sql
   CREATE DATABASE jwt_demo;
   ```
2. Build & run:
   ```bash
   mvn clean package
   mvn spring-boot:run
   ```
3. Endpoints:
   - `POST /auth/register` with JSON `{ "username":"user", "password":"pwd" }`
   - `POST /auth/login` with JSON `{ "username":"user", "password":"pwd" }` -> returns `{ "token": "..." }`
   - `GET /api/hello` with header `Authorization: Bearer <token>`

## Notes
- Change `jwt.secret` in `src/main/resources/application.properties` for production.
- For demo convenience H2 dependency is included, but the configuration uses MySQL by default.
