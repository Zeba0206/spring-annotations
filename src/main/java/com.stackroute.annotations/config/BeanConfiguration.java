package com.stackroute.annotations.config;


import com.stackroute.annotations.Beans.Actor;
import com.stackroute.annotations.Beans.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean(name="movie")
    public Movie getMovieBean()
    {
        return new Movie("Bahubali","S S Rajamouli",new Actor("Prabhas",40,"Male"));
    }

    @Bean(name="actor")
    public Actor getBeanActor()
    {
        return new Actor("Shah",50,"Male");
    }
}
