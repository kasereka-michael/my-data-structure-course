package arrayExercises;

public class TraverseArray {



    public static void main(String[] args){
        TraverseArray traverseArray = new TraverseArray();
        int[] myArray = {2,7,5,3,1,0,2,67};
        traverseArray.traverse(myArray);
    }


    public void traverse(int[] array){
            int n = array.length;
            for(int i = 0; i < n; i++){
                System.out.print(" " + array[i]);
            }
    }





}
