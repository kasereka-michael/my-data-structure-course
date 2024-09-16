package SlideWindows;

import java.util.Arrays;

public class MovesZerosToTheEnd {

    public static void main(String[] args) {
        MovesZerosToTheEnd MovesZerosToTheEnd = new MovesZerosToTheEnd();
        MovesZerosToTheEnd.moveZero(new int[]{2,0,49,9,2,0,1,3,5,6}, 9);
    }
    
    public void moveZero(int[] array, int n){
        int j = 0;
        for(int i = 0; i < n; i++){
            if(array[i] != 0 && array[j] == 0){
                int temp = array[i];
                array[i] =  array[j];
                array[j] = temp;
            }
            if (array[j] != 0){
                j++;
            }
        }

//       System.out.println(Arrays.stream(array).summaryStatistics());
    for (int i = 0; i < array.length -1; i++) {
        System.out.println(array[i]);
    }
    }
}
