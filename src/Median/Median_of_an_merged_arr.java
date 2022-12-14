package Median;

import java.util.Arrays;

public class Median_of_an_merged_arr {
    public static void main(String[] args) {
        int[] A1={1,2,4,7,9};
        int[] A2={3,9,6,12,13};

        int[] sonuc = new int [A1.length + A2.length];

        for (int i=0; i<A1.length + A2.length; i++) {
            if (i<A1.length)
                sonuc[i]=A1[i];
            else
                sonuc[i]=A2[i-A1.length];
        }

        Arrays.sort(sonuc);
        double median;

        if ((sonuc.length)%2==1) {
            median=sonuc[(sonuc.length)/2];
            System.out.println(median);
        } else {
            median=(double) (sonuc[sonuc.length/2]+sonuc[(sonuc.length/2)-1])/2;
            System.out.println(median);
        }
        System.out.println(Arrays.toString(sonuc));
    }
}
