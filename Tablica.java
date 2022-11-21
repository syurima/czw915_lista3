import java.util.List;
import java.util.Random;

public class Tablica {
    //1a

    public static void fill(int[] Tab, int k){

        Random generator = new Random();
        for(int i = 0; i<Tab.length; i++){
            Tab[i] = generator.nextInt(k);
        }
    }
    //1b
    public static void print (int[] Tab){
        for(int i = 0; i<Tab.length; i++){
            System.out.print(Tab[i] + " ");
        }
        System.out.println("");
    }
    public static void printReverse (int[] Tab){
        for(int i = Tab.length - 1; i>=0; i--){
            System.out.print(Tab[i] + " ");
        }
        System.out.println("");
    }
    //1d
    public static int countEven(int[] Tab){
        int e = 0;
        for (int i = 0; i < Tab.length; i++){
            if (Tab[i]%2 == 0) e++;
        }
        return e;
    }
    public static void even (int[]Tab, int[]Even, int[]Odd){
        int e = 0;
        int o = 0;
        for (int i = 0; i < Tab.length; i++){
            if (Tab[i]%2 == 0) {
                Even[e] = Tab[i];
                e++;
            }
            else{
                Odd[o] = Tab[i];
                o++;
            }
        }
    }
    public static void evenAL (int[]Tab, List<Integer> Even, List<Integer> Odd){
        for (int i = 0; i < Tab.length; i++){
            if (Tab[i]%2 == 0) Even.add(Tab[i]);
            else Odd.add(Tab[i]);
        }
    }
    //1e
    public static int max(int[] Tab, int k){
        int max = 0;
        for (int i = 0; i<Tab.length; i++){
            if (Tab[i] > max) max = Tab[i];
        }
        return max;
    }
    //1f
    public static int min(int[] Tab, int k){
        int min = k;
        for (int i = 0; i<Tab.length; i++){
            if (Tab[i] < min) min = Tab[i];
        }
        return min;
    }
}
