package moveZerosToEndOfArray;

public class MoveZeros {
    public void moveforZeros(int[] array) {

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0 && array[index] == 0) {

               int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
            if(array[index]!= 0){
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] array = {0,0,6,0,2,0,1,8};
        moveZeros.moveforZeros(array);
    }
}