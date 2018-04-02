profiles:
    dev
    local
    prod

mvnw clean install && mvnw spring-boot:run -pl testing-tool-web -Dspring.profiles.active=${profile}

Example: mvnw clean install && mvnw spring-boot:run -pl testing-tool-web -Dspring.profiles.active=local