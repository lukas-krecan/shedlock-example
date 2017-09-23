module shedlock.example {
    requires spring.context;
    requires spring.jdbc;
    requires slf4j.api;
    requires shedlock.core;
    requires shedlock.spring;
    requires HikariCP;
    requires shedlock.provider.jdbc.template;
    requires java.sql;

    exports net.javacrumbs.shedlockexample to spring.core;
    opens net.javacrumbs.shedlockexample to spring.core, spring.beans, spring.context;
}
