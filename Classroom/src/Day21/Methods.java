package Day21;

import java.lang.reflect.Array;

public class Methods {
    public static void main(String[] args) {
        int[] Array1 = {1,2,3,13,124,124,2};
        System.out.println(ArrrayMax(Array1));
        int a =1 ,b = 1, m = 1;
        System.out.println(Avg(a, b, m));

    }
    public static int  ArrrayMax (int[] array) {
        int max=array[0];
        for (int i=0; i< array.length;i++) {
            if (array[i]>max) max=array[i];
        }


        return max;
    }

    public static int Avg (int n1, int n2, int n3) {
        int avg = (n1+n2+n3)/3;
        return avg;
    }




}


