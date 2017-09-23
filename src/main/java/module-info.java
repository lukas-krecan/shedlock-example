module shedlock.example {
    requires spring.context;
    requires spring.jdbc;
    requires slf4j.api;
    requires shedlock.core;
    requires shedlock.spring;
    requires HikariCP;
    requires shedlock.provider.jdbc.template;
    requires java.sql;
}
