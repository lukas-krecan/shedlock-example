open module shedlock.example {
    requires spring.context;
    requires hsqldb;
    requires HikariCP;
    requires shedlock.core;
    requires slf4j.api;
    requires spring.jdbc;
    requires shedlock.provider.jdbc.template;
    requires shedlock.spring;
    requires java.sql;

    //opens net.javacrumbs.shedlockexample to spring.core;
    //exports net.javacrumbs.shedlockexample to spring.beans, spring.context;
}