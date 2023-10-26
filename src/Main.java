public class Main {
    final static int SIZE = 10;

    public static void main(String[] args) {
        double[] numberArray = new double[SIZE];
        System.out.println("Tablica wygenerowanych liczb");
        for (int i = 0; i < SIZE; i++) {
            numberArray[i] = (int) (Math.random() * 100) + 1;
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println();
        double[] array = selectionSort(numberArray);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static double[] selectionSort(double[] numberArray) {
        int size = numberArray.length;
        int tempIndex;
        double tempNumber;
        for (int i = 0; i < size; i++) {
            tempIndex = i;
            for (int j = i + 1; j < size; j++) if (numberArray[j] < numberArray[tempIndex]) tempIndex = j;
            tempNumber = numberArray[tempIndex];
            numberArray[tempIndex] = numberArray[i];
            numberArray[i] = tempNumber;
        }
        return numberArray;
    }

}