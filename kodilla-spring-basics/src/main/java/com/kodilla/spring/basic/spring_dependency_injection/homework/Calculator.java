package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        return display.display(result);
    }

    public double subtract(double a, double b) {
        double result = a - b;
        return display.display(result);
    }

    public double multiply(double a, double b) {
        double result = a * b;
        return display.display(result);
    }

    public double divide(double a, double b) {
        double result = a/b;
        if(b != 0) {
            return display.display(result);
        }else{
            System.out.print("Don't divide by: ");
            return 0.0;
        }
    }
}