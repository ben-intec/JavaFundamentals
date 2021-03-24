package chapter7;

//Opdracht 1 optioneel 3
public class SortingArrays {

    public static void main(String[] args) {

        int[] ints = {5,9,22,1,37,42,6,23,99,3,14,21,88,8};
//        int[] ints = {5,9,22,1,37,42};
        printInts("\nUnsorted:", ints);

        int[] intSelectionSorted = sortedSelection(ints);
        printInts("\nSelection Sort:", intSelectionSorted);

        int[] intBubbleSorted = sortedBubble(ints);
        printInts("\nBubble Sort:", intBubbleSorted);

    }

    public static int[] sortedBubble(int[] arr) {

        boolean noChanges;

        do {
            noChanges = true;
            for (int i = 0; i < arr.length -1; i++) {

                if(arr[i] > arr[i+1]){

                    int x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                    noChanges = false;
                }
            }
        } while (! noChanges);

        return arr;
    }

    public static int[] sortedSelection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int low = arr[i] ;

                if (arr[j] < arr[i]) {

                    arr[i] = arr[j];
                    arr[j] = low;
                    low = arr[i];
                }

            }
        }

        return arr;
    }
    public static void printInts(String heading, int[] arr) {
        System.out.println(heading);

        StringBuilder sb = new StringBuilder("{ ");

        for (int i : arr) {
            sb.append(i);
            sb.append(", ");
        }

        sb.setLength(sb.length() -2);
        sb.append(" }");

        System.out.println(sb);
    }
}
