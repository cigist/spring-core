/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.spring.core.main;

import com.cigist.spring.core.dao.EmployeeDao;
import com.cigist.spring.core.model.Employee;
import com.cigist.spring.core.model.HelloWorld;
import com.cigist.spring.core.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Irwan Cigist <cigist.developer@gmail.com>
 */
public class MainApp {
    private static ApplicationContext context;
    
    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
        hello.printMessage();

        System.out.println("==========================================");
        HelloWorld helloAlfa = (HelloWorld) context.getBean("helloAlfa");
        helloAlfa.printMessage();

        System.out.println("==========================================");
        Person person = (Person)  context.getBean("person");
        person.setName("Cigist");
        person.walking();
        person.eat();

        System.out.println("==========================================");
        Person person2 = new Person();
        person2.setName("aldo");
        person2.walking();

        EmployeeDao empDao = (EmployeeDao)context.getBean("employeeDao");
        Employee emp = empDao.finyById(5);
        System.out.println("ID : " +emp.getId());
        System.out.println("Nem : " +emp.getFirstName() +" "+emp.getLastName());
    }
}
