package net.javacrumbs.shedlockexample;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;


public class App {

    // start Db file first.
    public static void main(String[] args) throws InterruptedException, SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.start();
        Thread.sleep(100_000L);
        context.stop();
    }


}
