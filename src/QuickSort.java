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

            while(r >= l && a[r] > a[pivo]){
                r--;
            }

            if(l < r){
                swap(a, l, r);
            }
        }

        /*int aux = a[pivo];
        a[pivo] = a[r];
        a[r] = aux;*/
        swap(a,pivo,r);

        return r;
    }

    static void quickrec(int[] a, int l, int r) {
        if(0 <= l && r <= a.length && l <= r){
            int pos = partition(a, l, r);
            quickrec(a, l, pos -1);
            quickrec(a, pos + 1, r);
        }
    }

    static void quicksort(int[] a) {
        if(a.length == 0){
            return;
        } else{
            quickrec(a, 0, (a.length - 1));
        }
    }

}