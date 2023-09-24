public class selectionSort {
    public static void SelectionSort(int numbers[]) {
        for (int i = 0; i < numbers.length -1; i++) {
            int min = i;
            for (int j = i+1; j < numbers.length ; j++) {
                if (numbers[min]>numbers[j]) {
                    min = j;
                }
            }
            int temp = numbers[min];
            numbers[min]=numbers[i];
            numbers[i]=temp;
        }
    }
    public static void printarr(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }
    public static void main(String[] args) {
        
        int numbers[]={5,4,1,3,2};
SelectionSort(numbers);
printarr(numbers);
    }
}
