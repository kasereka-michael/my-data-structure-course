package removeEvenNumberInArray;

public class RemoveEvenNumberRevision {

    public int[] identifyEvenNumber(int[] array){
        int countEvenNumber = 0;
        for(int i=0; i< array.length; i++){
            if(array[i] % 2 != 0){
                countEvenNumber++;
            }
        }

        int[] newArray = new int[countEvenNumber];

        int idx = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                newArray[idx] = array[i];
                idx++;
            }
        }
        return newArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveEvenNumberRevision numberRevision = new RemoveEvenNumberRevision();
        int[] myArray = {24,54,6,8,1,5,2,98,10};

        int[] newArray = numberRevision.identifyEvenNumber(myArray);
        numberRevision.printArray(newArray);

    }
}
