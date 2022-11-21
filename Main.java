import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void tab(int size, int limit) {
        int[] Tab = new int[size];
        Tablica.fill(Tab, limit);

        System.out.println("1b) tablica :");
        Tablica.print(Tab);
        System.out.println("1c) tablica odwrotnie:");
        Tablica.printReverse(Tab);
        System.out.println("1e) wartość maksymalna: " + Tablica.max(Tab, limit));
        System.out.println("1f) wartość minimalna: " + Tablica.min(Tab, limit));
        int e = Tablica.countEven(Tab);
        int[] Even = new int[e];
        int[] Odd = new int[size - e];
        Tablica.even(Tab, Even, Odd);
        System.out.println("parzyste: ");
        Tablica.print(Even);
        System.out.println("nieparzyste: ");
        Tablica.print(Odd);
        //List<Integer> EvenAL = new ArrayList<Integer>();
        //List<Integer> OddAL = new ArrayList<Integer>();
        //Tablica.evenAL(EvenAL,OddAL);
        //System.out.println(EvenAL);
        //System.out.println(OddAL);
    }

    public static void matrix(int size, int limit) {
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];

        System.out.println("Macierz A:");
        Macierz.fill(A, limit);
        Macierz.print(A);

        System.out.println("Macierz B:");
        Macierz.fill(B, limit);
        Macierz.print(B);

        System.out.println("AxB:");
        Macierz.print(Macierz.iloczyn(A, B));

        System.out.println("A+B:");
        Macierz.print(Macierz.suma(A, B));

    }

    public static void main(String[] args) {
        //tab(5,10);
        matrix(5, 10);
    }
}