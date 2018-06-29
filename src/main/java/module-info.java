open module shedlock.example {
    requires spring.context;
    requires hsqldb;
    requires HikariCP;
    requires org.slf4j;
    requires spring.jdbc;
    requires net.javacrumbs.shedlock.provider.jdbctemplate;
    requires net.javacrumbs.shedlock.spring;
    requires java.sql;

    //opens net.javacrumbs.shedlockexample to spring.core;
    //exports net.javacrumbs.shedlockexample to spring.beans, spring.context;
}