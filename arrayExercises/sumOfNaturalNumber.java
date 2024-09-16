package arrayExercises;

public class sumOfNaturalNumber {



    static void finSum(int n){
        int sum = n * (n + 1) / 2;
        System.out.println("sum: " + sum);
    }

    public static void main(String[] args){

        int[] array = {2,4,6,7,89,3};

// initializing an array
int[] myArray = new int[10];

        for (int i = 0; i < array.length; i++){
            if(i == 3){
                array[i] = 800;            }
            System.out.println("index"+ i + " dataValue: " + array[i]);
        }
//        finSum(100000);
    }

    static void findSum(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }

}
