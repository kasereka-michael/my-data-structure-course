package removeOddNumberInArray;

public class RemoveOddNumber {

    public int[] removeOddNumberInArray(int[] array) {
        int countOddNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0) {
                countOddNumber++;
            }
        }
        int[] newArray = new int[countOddNumber];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
         RemoveOddNumber mainClass = new RemoveOddNumber();
        int[] arr = {3,2,4,7,10,6,5};
        mainClass.printArray(mainClass.removeOddNumberInArray(arr));

    }
}
