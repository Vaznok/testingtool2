cd Prerequisites
==============
| **Tool** | **Required Version** | **How to check**  |
| ---------| ---------------------| ----------------- |
| Java     | 1.8.x                | java -version     |
| Maven    | 3.5.3                | mvn -version      |
| Git      |           any        | git --version     |
| MySQL    | 6.3.x (or newer)     | mysql --version   |

##Setup##

Java
----------
Download and install latest JDK from `http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html`

Maven
----------
Download and install Maven from `https://maven.apache.org/download.cgi`

MySQL
-----------
  * Download and install latest MySQL community server from `http://dev.mysql.com/downloads/mysql/`
  * Download MySQL Workbench: https://dev.mysql.com/downloads/workbench/

MariaDB
-----------
Download a MariaDB installation by this link: https://downloads.mariadb.org/mariadb/10.2.7/

# IDE Setup
Configure your IntelliJ IDEA
File->Settings->Plugins
1.install Lombok plugin
2.install checkStyle plugin

# Packaging #
>mvnw clean install

## Building/running ##

`Profiles:`
    dev
    local
    prod

To **_run application with maven (without using docker)_** execute

>mvnw clean install && mvnw spring-boot:run -pl testing-tool-web -Dspring.profiles.active=${profile}

`Example:` mvnw clean install && mvnw spring-boot:run -pl testing-tool-web -Dspring.profiles.active=local
