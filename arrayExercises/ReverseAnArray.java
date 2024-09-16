package arrayExercises;

public class ReverseAnArray {


    public static void main(String[] args) {
        int[] array = {2,11,5,10,7,8};
        int[] theArray = reverseArray(array);
        printArray(theArray);
        System.out.println("array length " + array.length);

    }

    static int[] reverseArray(int[] array){
        int[] reversedArray = new int[array.length];
        int index = 0;

        for(int i = array.length-1; i >= 0 ; i--){
            reversedArray[index] = array[i];
          index++;
        }
        return reversedArray;
    }

  static void printArray(int[] array){
        for(int i= 0; i < array.length; i++){
            System.out.print(" "+array[i]);
        }
  }

}
