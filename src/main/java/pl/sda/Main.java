package pl.sda;

import pl.sda.calculate.MathCalculation;
import pl.sda.calculate.impl.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
           Aplikacja do kolejkowania obliczeń matematycznych.
           Sposób działania:
           Użytkownik wprowadza do 10 symboli spośród 7 możliwych:
           + dodawanie
           - odejmowanie
           * mnozenie
           ^ potegowanie
           / dzielenie
           i inkrementacja (dodanie 1) - to na później
           d dekrementacja (odejmowanie 1) - to na później
           s pierwiastek kwadratowy - to na później
           np.
           --+*
           Następnie użytkownik wprowadza liczby na których chce wykonywać przedstawione zadania.
           Zawsze jedna więcej niż operacji.
           np.
           52219
           Następnie wykonujemy operacje na wprowadzonych cyfrach:
           5-2=3
           3-2=1
           1+1=2
           2*9=18
           Inny przykład
           *****
           222222
           A więc obliczenia będą następujące:
           2*2=4
           4*2=8
           8*2=16
           16*2=32
           32*2=64
           W konsoli wypisujemy natomiast tylko wyniki poszczególnych operacji


           1. Stwórz interfejs MathCalculation w pakiecie pl.sda.calculate:
             * z metodą double calculate()
           2. Stwórz klasę abstrakcyjną TwoNumbersCalculation implementującą MathCalculation w pakiecie pl.sda.calculate.impl:
              * Powinna mieć 2 pola typu double nazwane "a" oraz "b"
              * Powinna mieć konstruktor przyjmujący "a" i "b" w argumentach i przypisujący do pola
              * Powinna mieć gettery dla "a" i "b"
           3. Stwórz klasy dziedziczące po TwoNumbersCalculation dla wszystkich operacji analogicznie do poniższego przykładu dla dodawania
           Klasy powinny być w pl.sda.calculate.impl
              a. Stwórz klasę SumCalculation dziedziczącą z TwoNumbersCalculation, pamiętaj o konstruktorze!
              b. W klasie zaimplementuj metodę double calculate() - wymagalność tej metody wynika z tego, że TwoNumbersCalculation implementuje MathCalculation
                 W implementacji powinna być dodawane do siebie wartości "a" i "b".
                 Pamiętaj, że nie mamy dostępu bezpośredniego do pół z klasy nadrzędnej, ale może da się dostać ich wartość jakąś metodą?
                 Podpowiedź zapisana od tyłu: (: )(Bteg + )(Ateg
           4. W main:
              a. Pobierz od użytkownika symbole operacji i liczby
              b. Zamień Stringa z symbolami na tablicę Stringów lub charów i przypisz do zmiennej "symbols"
              c. Zamień Stringa z liczbami na tablicę intów i przypisz do zmiennej "numbers"
              d. Utwórz zmienną przechowującą informację o następnym elemencie do pobrania z tablicy intów (na początku 1), nazwa - queueIndex
              Będziemy inkrementować tą wartość za każdym razem kiedy pobierzemy liczbę z tablicy, żeby przechodzić po kolei po liczbach.
              W tej chwili inicjujemy na jeden, gdyż w f pobieramy już zerową wartość
              e. Utwórz zmienną przechowującą aktualnie uruchamianą operację obliczania (np. sumowanie), jej typ to MathCalculation, nazwa calculation.
              Nie inicjalizuj na razie na żadną wartość.
              f. Utwórz zmienną przechowującą wynik dotychczas wykonanych operacji, przypisz pierwszą wartość z tablicy liczb, nazwa np. calculationResult
              g. Iteruj (za pomocą pętli) po symbolach operacji, w tej pętli:
                 ga. dla danego symbolu twórz odpowiednią implementację, więc jeśli ten symbol to:
                       plus - przypisz do zmiennej calculation new SumCalculation(calculationResult, numbers[queueIndex])
                       minus - przypisz do zmiennej calculation new SubtractCalculation(calculationResult, numbers[queueIndex])
                       itd. dla mnożenia, dzielenia, potęgowania
                     tutaj nie ma magii, robimy zwyczajne ify. if(symbol.equals("+")){ ... } else if(symbol.equals("-") { ... itd.
                 gb. inkrementuj queueIndex
                 gc. wykonaj calculation.calculate(), a wynik przypisz do zmiennej calculationResult
           5. Uruchom aplikację i przetestuj, powinna działać :)
           W poniższych punktach już nie piszę w jakich pakietach co umieszczać, trzeba postępować analogicznie jak wyżej.
           Sprawdzimy razem czy dobrze umieściłeś/aś klasy w pakietach już razem :)
           6. Operacje jednoargumentowe:
              i - inkrementacja
              d - dekrementacja
              s - pierwiastek kwadratowy
              to operacje potrzebujące tylko jednej liczby
              Stwórz klasę abstrakcyjną OneNumberOperation implementującą MathCalculation, powinna mieć
                * jedno pole "a" i konstruktor ustawiający to pole
                * getter dla tego pola
           7. Analogicznie jak było to w 2. stwórz klasy:
              a. IncrementationCalculation - tutaj można pójść trochę na skróty i wykorzystać istniejącą klasę, ale nie trzeba
              b. DecrementationCalculation - tutaj tak samo
              c. SquareRootCalculation - ale tutaj nie
              Tym razem każda klasa powinna dziedziczyć po klasie abstrakcyjnej OneNumberOperation i implementować w sobie
              funkcję calculate. W funkcji pobieramy pole a i wykonujemy na tej liczbie odpowiednią operację
              inkrpementację, dekrementację albo pierwiastek
           8. W mainie dopisz odpowiednie ify, np. jeśli pojawi się symbol "i" do calculation powinno zostać przypisane
           new IncrementationCalculation(calculationResult) i NIE powinniśmy inkrementować queueIndex (bo nic nie pobieramy z kolejki).
           9. Powinno działać :)
         */

        MathCalculation sumCalculation = new MultiplyCalculation(4, 4);
        System.out.println(sumCalculation.calculate());


        /*
         * 4. W main:
         *               a. Pobierz od użytkownika symbole operacji i liczby
         *               b. Zamień Stringa z symbolami na tablicę Stringów lub charów i przypisz do zmiennej "symbols"
         *               c. Zamień Stringa z liczbami na tablicę intów i przypisz do zmiennej "numbers"
         *               d. Utwórz zmienną przechowującą informację o następnym elemencie do pobrania z tablicy intów (na początku 1), nazwa - queueIndex
         *               Będziemy inkrementować tą wartość za każdym razem kiedy pobierzemy liczbę z tablicy, żeby przechodzić po kolei po liczbach.
         *               W tej chwili inicjujemy na jeden, gdyż w f pobieramy już zerową wartość
         *               e. Utwórz zmienną przechowującą aktualnie uruchamianą operację obliczania (np. sumowanie), jej typ to MathCalculation, nazwa calculation.
         *               Nie inicjalizuj na razie na żadną wartość.
         *               f. Utwórz zmienną przechowującą wynik dotychczas wykonanych operacji, przypisz pierwszą wartość z tablicy liczb, nazwa np. calculationResult
         *               g. Iteruj (za pomocą pętli) po symbolach operacji, w tej pętli:
         *                  ga. dla danego symbolu twórz odpowiednią implementację, więc jeśli ten symbol to:
         *                        plus - przypisz do zmiennej calculation new SumCalculation(calculationResult, numbers[queueIndex])
         *                        minus - przypisz do zmiennej calculation new SubtractCalculation(calculationResult, numbers[queueIndex])
         *                        itd. dla mnożenia, dzielenia, potęgowania
         *                      tutaj nie ma magii, robimy zwyczajne ify. if(symbol.equals("+")){ ... } else if(symbol.equals("-") { ... itd.
         *                  gb. inkrementuj queueIndex
         *                  gc. wykonaj calculation.calculate(), a wynik przypisz do zmiennej calculationResult
         */
        System.out.println("Allowed operations +, -, /, *, i(ncrementation), d(ecrementation), p(ower square), r(oot square).");
        System.out.println("Write down a calculation you want to perform:");
        Scanner scanner = new Scanner(System.in);
        String[] symbols = scanner.nextLine().split("");
        String[] numbersString = scanner.nextLine().split("");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        int queueIdx = 0;
        MathCalculation calculation;
        double calculationResult = numbers[0];
        for (int i = 0; i < symbols.length; i++) {
            switch (symbols[i]) {
                case "+":
                    ++queueIdx;
                    calculation = new SumCalculation(calculationResult, numbers[queueIdx]);
                    break;
                case "-":
                    ++queueIdx;
                    calculation = new SubtractCalculation(calculationResult, numbers[queueIdx]);
                    break;
                case "/":
                    ++queueIdx;
                    calculation = new DivideCalculation(calculationResult, numbers[queueIdx]);
                    break;
                case "*":
                    ++queueIdx;
                    calculation = new MultiplyCalculation(calculationResult, numbers[queueIdx]);
                    break;
                case "i":
                    calculation = new IncrementationCalculation(calculationResult);
                    break;
                case "d":
                    calculation = new DecrementationCalculation(calculationResult);
                    break;
                case "s":
                    calculation = new SquareRootCalculation(calculationResult);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + symbols[i]);
            }
            calculationResult = calculation.calculate();
        }
        System.out.println("Result = " + calculationResult);

    }
}
