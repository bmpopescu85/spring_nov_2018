package main;

import beans.Cat;
import beans.Dog;
import beans.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    // FileSystemXmlApplicationContext, ClassPathXmlApplicationContext
    // AnnotationConfigApplicationContext
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("C:\\STUDY\\SACONF2019\\curs1exemplu1\\src\\main\\resources\\appContext.xml");

        // singleton vs prototype
        Cat cat1 = context.getBean(Cat.class); // by type
        System.out.println(cat1);

        Cat cat2 = context.getBean("cat1",Cat.class); // by name
        System.out.println(cat2);

        Dog dog1 = context.getBean(Dog.class);
        System.out.println(dog1);

        Human h1 = context.getBean(Human.class);
        System.out.println(h1);
    }
}
