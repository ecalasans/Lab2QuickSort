/**
 * Created by ericcalasans on 31/03/17.
 */

// Classe Quicksort a ser completada
class Quicksort {

    static void swap(int[] a, int i, int j) {
        int temp;

        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    static int partition(int[] a, int l, int r) {
        int pivo = l;

        while (l < r){
            while (l <= r && a[l] <= a[pivo]){
                l++;
            }

            while(a[r] > a[pivo]){
                r--;
            }

            if(l < r){
                swap(a, l, r);
            }
        }

        int aux = a[pivo];
        a[pivo] = a[r];
        a[r] = aux;

        return r;
    }

    static void quickrec(int[] a, int l, int r) {
        // a ser completada
    }

    static void quicksort(int[] a) {
        // a ser completada
    }

}