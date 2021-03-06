package pl.sda.calculate.impl;

import pl.sda.calculate.MathCalculation;

/*
2. Stwórz klasę abstrakcyjną TwoNumbersCalculation implementującą MathCalculation w pakiecie pl.sda.calculate.impl:
              * Powinna mieć 2 pola typu double nazwane "a" oraz "b"
              * Powinna mieć konstruktor przyjmujący "a" i "b" w argumentach i przypisujący do pola
              * Powinna mieć gettery dla "a" i "b"
 */
public abstract class TwoNumbersCalculation extends OneNumberOperation {
    private double b;

    public TwoNumbersCalculation(double a, double b) {
        super(a);
        this.b = b;
    }

    public final double getB() {
        return b;
    }
}
