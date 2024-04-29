public class Main<T extends Comparable<T>> {
    void bubblesort(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    T temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (T element : a) {

            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main<Integer> obj1 = new Main<>();
        Integer[] a = {5, 4, 3, 2, 1};
        obj1.bubblesort(a);
        Main<String> obj2 = new Main<>();
        String[] s = {"praveen", "sampath", "murali", "upendra"};
        obj2.bubblesort(s);
    }
}
