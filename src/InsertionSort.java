public class InsertionSort {
    static int[] list = {54, 2, 4, 75, 8, 3, 9};

    public static void main(String[] args) {
        System.out.print("Your list is: \n");
        for (int i : list) {
            System.out.print(i + "\t");
        }
        System.out.println("\nYour list after sort:");
        selectionSort(list);
        for (int i : list) {
            System.out.print(i + "\t");
        }
    }

    public static void selectionSort(int[] list) {


        for (int i = 0; i < list.length; i++) {
            int element = list[i];
            int position = i;
            for (int j = i + 1; j < list.length; j++) {
                if (element > list[j]) {
                    element = list[j];
                    position = j;
                }
            }
            if (position != i) {
                list[position] = list[i];
                list[i] = element;
            }
        }
    }
}
