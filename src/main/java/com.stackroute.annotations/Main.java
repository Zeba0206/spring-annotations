package com.stackroute.annotations;

import com.stackroute.annotations.Beans.Actor;
import com.stackroute.annotations.Beans.Movie;
import com.stackroute.annotations.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext bean = new AnnotationConfigApplicationContext();

        bean.register(AppConfig.class);
        bean.refresh();

        Movie movie = (Movie)bean.getBean("movie");
        Actor actor = (Actor)bean.getBean("actor");

        System.out.println(movie);
        System.out.println(actor);

    }

}
