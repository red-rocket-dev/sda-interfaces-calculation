package pl.sda.calculate.impl;
/*
3. Stwórz klasy dziedziczące po TwoNumbersCalculation dla wszystkich operacji analogicznie do poniższego przykładu dla dodawania
           Klasy powinny być w pl.sda.calculate.impl
              a. Stwórz klasę SumCalculation dziedziczącą z TwoNumbersCalculation, pamiętaj o konstruktorze!
              b. W klasie zaimplementuj metodę double calculate() - wymagalność tej metody wynika z tego, że TwoNumbersCalculation implementuje MathCalculation
                 W implementacji powinna być dodawane do siebie wartości "a" i "b".
                 Pamiętaj, że nie mamy dostępu bezpośredniego do pół z klasy nadrzędnej, ale może da się dostać ich wartość jakąś metodą?
                 Podpowiedź zapisana od tyłu: (: )(Bteg + )(Ateg
 */
public class MultiplyCalculation extends TwoNumbersCalculation {
    public MultiplyCalculation(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculate() {
        return getA() * getB();
    }
}
