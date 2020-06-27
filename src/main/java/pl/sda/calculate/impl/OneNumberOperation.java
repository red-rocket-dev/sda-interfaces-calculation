package pl.sda.calculate.impl;

import pl.sda.calculate.MathCalculation;

/*
Stwórz klasę abstrakcyjną OneNumberOperation implementującą MathCalculation, powinna mieć
                * jedno pole "a" i konstruktor ustawiający to pole
                * getter dla tego pola
 */
public abstract class OneNumberOperation implements MathCalculation {
    private double a;

    public OneNumberOperation(double a) {
        this.a = a;
    }

    public final double getA() {
        return a;
    }
}
