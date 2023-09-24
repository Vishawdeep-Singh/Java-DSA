public class insertionSort {
    public static void InsertionSort(int numbers[]) {
        for (int i = 1; i < numbers.length; i++) {
            int curr = numbers[i];
            int prev = i-1;
            // finding out correct position
            while (prev>=0 && numbers[prev]> curr ) {
                numbers[prev+1]=numbers[prev];
                prev--;
            }
            // insertion
            numbers[prev+1]= curr; // confuse point refer class note book
        }
        
    }
    public static void Printarray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
    }

    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
    InsertionSort(numbers);
    Printarray(numbers);

    }
}
