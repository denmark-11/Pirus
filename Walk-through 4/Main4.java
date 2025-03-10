public class Main4 {
    public static void main(String[] args) {
        // Declare and initialize an array with new values
        int[] dataSet = {12, 7, 19, 3, 15};

        // Bubble Sort Algorithm
        for (int outerIndex = 0; outerIndex < dataSet.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < dataSet.length - 1 - outerIndex; innerIndex++) {
                if (dataSet[innerIndex] > dataSet[innerIndex + 1]) {
                    // Swap elements
                    int temp = dataSet[innerIndex];
                    dataSet[innerIndex] = dataSet[innerIndex + 1];
                    dataSet[innerIndex + 1] = temp;
                }
            }
        }

        // Printing Sorted Array
        System.out.print("Sorted Array: ");
        for (int value : dataSet) {
            System.out.print(value + " ");
        }
    }
}
