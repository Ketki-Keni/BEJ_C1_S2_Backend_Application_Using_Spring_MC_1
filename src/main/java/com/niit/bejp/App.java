package com.niit.bejp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = applicationContext.getBean("movie1", Movie.class);
        System.out.println(movie);
        Movie movie1 = applicationContext.getBean("movie2", Movie.class);
        System.out.println(movie1);
    }
}
