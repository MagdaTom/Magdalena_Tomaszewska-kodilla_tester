public class Exercise {
    /* Twoim zadaniem jest obliczenie podatku od dochodu. Obecnie wynosi on 17%. Wiemy, także doświadczeni programiści potrafią zarabiać pokaźne sumy, a od pewnego dochodu zwiększony jest podatek do 32%. Sprawdź ile podatku musiałby zapłacić początkujący programista, zanim przekroczy próg wynoszący 85 528 zł, a ile już ten doświadczony.

Wzór:
dla dochodu do 85 528 zł podatek wynosi 17%,
dla dochodu powyżej 85 528 zł liczy się go następująco:
- obliczamy podatek 17% z 85 528,
- dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
czyli dochód pomniejszony o 85 528 zł i z tego 32%.
(oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).
Uwaga: zrób dodatkowe zabezpieczenie, jeżeli ktoś miałby więcej wydatków niż przychodu, czyli podałby kwotę ujemną dochodu ;)

     */
    public static void main(String[] args) {

        double dochod = 89000;

        if (dochod <= 0) {
            System.out.println("Podatek jest zerowy");
        } else if (dochod <= 85528) {
            double podatek19 = dochod * 0.17;
            System.out.println("Podatek 19: " + podatek19);
        } else {
            double podatek19 = 85528 * 0.17;
            double podatek32 = (dochod - 85528) * 0.32;
            double podatek = podatek19 + podatek32;
            System.out.println("Podatek 32: " + podatek);
        }
        double dochod2 = 89000;
        System.out.println(kwotaPodatku(dochod2));
    }

    public static double kwotaPodatku(double a) {
        if (a <= 0) {
            return 0;
        }
        else if(a <= 85528) {
            return a * 0.17;
        }
        else {
            return 85528 * 0.17 + (a - 85528) * 0.32;
        }
    }
}

