package findMax;


public class FindMaximum {
    public void findMaximumValue(int array[]){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] >= max){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public void find2MaximumValue(int array[]){
        int max = array[0];
        int secondMax = array[0];
        for(int i = 0; i < array.length; i++){
            if(secondMax > max){
                int temp = secondMax;
                secondMax = max;
                max = temp;
            }
            secondMax = array[i];
        }
        System.out.println(max + " "+secondMax);
    }



    public static void main(String[] args) {
        FindMaximum findMaximum = new FindMaximum();
        int[] myArray = {23,4,5,2,87,32,70};
        findMaximum.find2MaximumValue(myArray);

    }
}
