package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.domain.Animal;
import test.domain.Cat;
import test.domain.Dog;
import test.service.CatService;
import test.service.CatServiceImpl;
import test.service.DogService;
import test.service.DogServicempl;

import java.util.List;

/**
 * Created by Chuvychin on 19.04.2015.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        CatService catService = context.getBean("catServiceImpl", CatServiceImpl.class);
        DogService dogService = context.getBean("dogServicempl",DogServicempl.class);

        List<Cat> cats = catService.findAll();
        List<Dog> dogs = dogService.findAll();

        System.out.println(cats);
        System.out.println(dogs);
    }
}
