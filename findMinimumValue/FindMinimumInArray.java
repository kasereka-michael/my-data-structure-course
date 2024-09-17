package findMinimumValue;

public class FindMinimumInArray {
    public void findMinimumValue(int[] array){

        int minimum = array[0];
        for(int i = 0; i< array.length; i++){
            if(array[i] <= minimum){
                minimum = array[i];
            }
        }
        System.out.println(minimum);
    }

    public void find2MinimumValue(int[] array){

        int minimum1 = array[0];
        int minimum2 = array[0];
        for(int i = 0; i< array.length; i++){
            if(array[i] <= minimum2){
                minimum2 = array[i];
                if (minimum2 <= minimum1) {
                    int temp = minimum1;
                    minimum1 = minimum2;
                    minimum2 = temp;
                }
            }
        }
        System.out.println(minimum1 + " " + minimum2);
    }





    public static void main(String[] args) {
        FindMinimumInArray minimumInArray = new FindMinimumInArray();
        int[] myArray = {10,34,5,6,76,6,12,7,};

        minimumInArray.find2MinimumValue(myArray);

    }
}
