package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueIfWeightLessThan30(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryServiceEurope bean = context.getBean(DeliveryServiceEurope.class);
        boolean delivery = bean.deliverPackage("Legnicka Street", 29);
        Assertions.assertTrue(delivery);
    }

    @Test
    public void shouldReturnTrueIfWeightIsEqualTo30(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryServiceEurope bean = context.getBean(DeliveryServiceEurope.class);
        boolean delivery = bean.deliverPackage("Legnicka Street", 30);
        Assertions.assertTrue(delivery);
    }

    @Test
    public void shouldReturnFalseIfWeightOver30(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryServiceEurope bean = context.getBean(DeliveryServiceEurope.class);
        boolean delivery = bean.deliverPackage("Legnicka Street", 31);
        Assertions.assertFalse(delivery);
    }

    @Test
    public void shouldReturnMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationServiceEurope bean = context.getBean(NotificationServiceEurope.class);
        String message = bean.success("Legnicka Street");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldReturnCorrectMessageIfSuccessfulDelivery(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationServiceEurope bean = context.getBean(NotificationServiceEurope.class);
        String message = bean.success("Legnicka Street");
        Assertions.assertNotNull("Package delivered to: Legnicka Street", message);
    }

    @Test
    public void shouldReturnCorrectMessageIfDeliveryFailed(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationServiceEurope bean = context.getBean(NotificationServiceEurope.class);
        String message = bean.success("Legnicka Street");
        Assertions.assertNotNull("Package not delivered to: Legnicka Street", message);
    }

    @Test
    public void shouldReturnCorrectMessageIfWeightLessOrEqualTo30(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Legnicka Street", 25);
        Assertions.assertEquals("Package delivered to: Legnicka Street", message);
    }

    @Test
    public void shouldReturnCorrectMessageIfWeightMoreThan30(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Legnicka Street", 50);
        Assertions.assertEquals("Package not delivered to: Legnicka Street", message);
    }
}