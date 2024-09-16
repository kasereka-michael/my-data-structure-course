package removeEvenNumberInArray;

public class RemoveEvenNumber {

    public int[] removeEvenNumberInArray(int[] array) {
        int countEvenNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0) {
                countEvenNumber++;
            }
        }
        int[] newArray = new int[countEvenNumber];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
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
         RemoveEvenNumber mainClass = new RemoveEvenNumber();
        int[] arr = {3,2,4,7,10,6,5};
        mainClass.printArray(mainClass.removeEvenNumberInArray(arr));

    }
}
