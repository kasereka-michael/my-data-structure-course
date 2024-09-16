package arrayExercises;

public class findTheMinimum {

    public static void main(String[] args) {
        int[] array = {2,67,1,67,89,53,9,0};
     String string =  findMinimum(array);

      System.out.println("minimum: " + string);
    }

    static String findMinimum(int[] array){
        int firstMinimum = 0;
        int secondMinimum = 0;
        for(int i = 0; i < array.length - 1; i++){
            int temp = array[i];

        }
        return "this is the first Minimum : " + firstMinimum + " and the secondMinimum is " + secondMinimum;
    }
}
