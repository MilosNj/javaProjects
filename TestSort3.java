package testsort3;

import java.util.Random;

public class TestSort3 {

    public static void bubbleSort(int[] a) {
        int n = a.length;
        int temp;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    // zameni elemente
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void insertSort(int[] a) {
        int n = a.length;
        
        for (int j = 0; j < n; j++) {
            int k = a[j];
            int i = j - 1;
            
            while ((i > -1) && (a[i] > k)) {
                a[i + 1] = a[i];
                i--;
            }
            
            a[i + 1] = k;
        }
    }

    public static void selectSort(int[] a) {
        int n = a.length;
        
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[index]) {
                    // trazi najmanji index
                    index = j;
                }
            }
            
            int manjiBroj = a[index];
            a[index] = a[i];
            a[i] = manjiBroj;
        }
    }

    public static void main(String[] args) {
        int[] nizX = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < nizX.length; i++) {
            nizX[i] = random.nextInt(10) + 1;
        }
        
        int[] unsortedNizX1 = nizX;
        int[] unsortedNizX2 = nizX;
        int[] unsortedNizX3 = nizX;
        
        System.out.println("Niz X pre sortiranja");
        
        for (int i = 0; i < nizX.length; i++) {
            System.out.println(nizX[i] + " ");
        }
        
        System.out.println();
        
        bubbleSort(unsortedNizX1);
        
        System.out.println("Niz X posle bubbleSort");
        
        for (int i = 0; i < unsortedNizX1.length; i++) {
            System.out.println(unsortedNizX1[i] + " ");
        }
        
        System.out.println();
        
        insertSort(unsortedNizX2);
        
        System.out.println("Niz X posle insertSort");
        
        for (int i = 0; i < unsortedNizX2.length; i++) {
            System.out.println(unsortedNizX2[i] + " ");
        }
        
        System.out.println();
        
        selectSort(unsortedNizX3);
        
        System.out.println("Niz X posle bubbleSort");
        
        for (int i = 0; i < unsortedNizX3.length; i++) {
            System.out.println(unsortedNizX3[i] + " ");
        }
        
        System.out.println();
        
        int[] nizY = new int[100000];
        
        for (int i = 0; i < nizY.length; i++) {
            nizY[i] = random.nextInt(100) + 1;
        }
        
        int[] unsortedNizY1 = nizY;
        int[] unsortedNizY2 = nizY;
        int[] unsortedNizY3 = nizY;
        
        System.out.println("Trenutno vreme u milisekundama pre bubbleSort = ");
        System.out.println(System.currentTimeMillis());
        
        bubbleSort(unsortedNizY1);
        System.out.println("Trenutno vreme u milisekundama posle bubbleSort = ");
        System.out.println(System.currentTimeMillis());
        
        System.out.println("Trenutno vreme u milisekundama pre insertSort = ");
        System.out.println(System.currentTimeMillis());
        
        insertSort(unsortedNizY2);
        System.out.println("Trenutno vreme u milisekundama posle insertSort = ");
        System.out.println(System.currentTimeMillis());
        
        System.out.println("Trenutno vreme u milisekundama pre selectSort = ");
        System.out.println(System.currentTimeMillis());
        
        selectSort(unsortedNizY3);
        System.out.println("Trenutno vreme u milisekundama posle selectSort = ");
        System.out.println(System.currentTimeMillis());
    }
}
