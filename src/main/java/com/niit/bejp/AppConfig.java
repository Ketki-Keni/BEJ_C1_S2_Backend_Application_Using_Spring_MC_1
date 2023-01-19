/*
 * Author : Ketki Keni
 * Date : 19-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("movie1")
    public Movie getMovie1(){
        return new Movie(001,"Inception","8 July, 2010 ",8);
    }

    @Bean("movie2")
    public Movie getMovie2(){
        return new Movie(002,"The Shawshank Redemption","22 September, 1994",9);
    }

}
