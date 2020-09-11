import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
import java.util.Random.*;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Random ran=new Random();
        int a=0;
        int b=10;
        int r=a+(int)(Math.random()*b);
        int[] m=new int[abs(r)];
        for(int i=0;i<r;i++){
            m[i]=ran.nextInt(10000);
        }
        for(int i=0;i<r;i++){
            System.out.println(m[i]);
        }
        System.out.println("сортировка");
        shakerSort(m);
        for(int i=0;i<r;i++){
            System.out.println(m[i]);
        }
    }
    public static void shakerSort(int arr[]) {
        int buff;
        int left = 0;
        int right = arr.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);
    }

}
