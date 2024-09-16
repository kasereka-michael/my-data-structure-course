package arrayExercises;

public class RemoveInteger {


    public static void main(String[] args){
        int[] returnedArray = removeEvenInteger(new int[]{3,2,4,7,10,6,5});

        printArray(returnedArray);

    }

    static int[] removeEvenInteger(int[] myArray){
        int length = identifyOddInteger(myArray);
        int[] myNewArray = new int[length];
        int result = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] % 2 != 0){
                myNewArray[result] = myArray[i];
                    result++;
            }
        }
        return myNewArray;

    }
    static int identifyOddInteger(int[] myArray){
        int countOdd = 0;

        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    static void printArray (int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            System.out.print(" " +myArray[i]);
        }
    }
}
