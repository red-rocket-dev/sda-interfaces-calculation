package pl.sda.calculate.impl;

public class SquareRootCalculation extends OneNumberOperation {
    public SquareRootCalculation(double a) {
        super(a);
    }

    @Override
    public double calculate() {
        return Math.sqrt(getA());
    }
}
