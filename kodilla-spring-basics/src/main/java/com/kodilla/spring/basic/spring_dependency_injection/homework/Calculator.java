package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        display.display(a);
        display.display(b);
        return a + b;
    }

    public double subtract(double a, double b) {
        display.display(a);
        display.display(b);
        return a - b;
    }

    public double multiply(double a, double b) {
        display.display(a);
        display.display(b);
        return a * b;
    }

    public double divide(double a, double b) {
        if(b != 0) {
            display.display(a);
            display.display(b);
            return a / b;
        }else{
            System.out.print("Don't divide by: ");
            return 0.0;
        }
    }
}