package reverseArray;

public class ReverseArray {

    public void reverseArray(int[] array){
        for (int i = array.length-1; i >= 0; i-- ){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] array = {23,56,3,7,1,0};

        reverseArray.reverseArray(array);
    }

}
