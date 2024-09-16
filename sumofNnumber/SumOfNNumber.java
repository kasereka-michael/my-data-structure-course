package sumofNnumber;

import javax.management.timer.Timer;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class SumOfNNumber {




    public  int sumOfN(int n){
        return n * (n + 1) / 2;
    }

    public int findSumOfN(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public void myArrayMethod(){
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 3;
        myArray[3] = 44;
        myArray[4] = 15;
        myArray[2] = 16;

        printArray(myArray);
    }
public void printArray(int array[]) {


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    System.out.println();
}
    public static void main(String[] args) {
        SumOfNNumber sumOfNNumber = new SumOfNNumber();

        double start = System.currentTimeMillis();

//        System.out.println(sumOfN(99999));

//        System.out.println(System.currentTimeMillis() - System.nanoTime() / 1000000);
//        System.out.println(findSumOfN(99999));
        System.out.println(System.currentTimeMillis() - start);

        sumOfNNumber.myArrayMethod();
    }
}
