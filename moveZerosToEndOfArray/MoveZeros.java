package moveZerosToEndOfArray;

public class MoveZeros {
    public void moveforZeros(int[] array) {

        int index1 = 0, temp = 0, index2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[index1] != 0 && array[index2] != 0) {
                index2++;
            } else if (array[index2] == 0) {
                index1 = index2;
                temp = array[index2];
                index2++;
                array[index1] = array[index2];
                array[index2] = temp;
            }
            else {
                index2++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] array = {2,4,6,0,2,0,1,8};
        moveZeros.moveforZeros(array);
    }
}