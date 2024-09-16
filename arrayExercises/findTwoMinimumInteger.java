package arrayExercises;

public class findTwoMinimumInteger {

    public static void main(String[] args) {
        int[] array = {90,67,4,67,89,53,9,100};
        int minimum = findMinimum(array);

        System.out.println("minimum: " + minimum);
    }

//    temp 1
//    minimum 1
//    array 53(5)

    static int findMinimum(int[] array){
        int minimum = array[0];
        int temp = array[0];
        for(int i = 0; i < array.length - 1; i++){

            if(minimum > array[i +1]){
                temp = array[i+1];
            }
            if(temp < minimum){
                minimum = temp;
            }
        }
        return minimum;
    }

}
