package zajecia3;

public class zajecia3 {

    public static void main(String[] args) {
        zadanie2();
    }

//    public static void zadanie1() {
//
//        int a = 15;
//          int b = 33;
////
////        int wynik1 = zmienna1/dzielnik;
////    int wynik2 = zmienna2/dzielnik;
////
//        int dzielnik = 1;
//
//        if (a>=b) {
//
//            for (int i = 1; i <= b; i++) {
//                if (a% i == 0 && b% i==0) {
//                    dzielnik = i;
//                }
//            }
//        }else   {
//            for (int i = 1; i<=a; i++){
//                if (a% i == 0 && b% i== 0) {
//                    dzielnik = i;
//                }
//            }
//        }
//        System.out.println("Największy dzielnik wspólny to: " + dzielnik);
//
//
//    }

    public static int zadanie2() {
        // Funkcja zwracająca sumę elementów tablicy


        int liczby[] = new int[] {2,3,4,5};
    int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];

        }
        System.out.println( suma);
        return suma;



    }


}


