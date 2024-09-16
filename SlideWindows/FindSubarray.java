package SlideWindows;

import javax.xml.transform.stax.StAXResult;

public class FindSubarray {

    public static void main(String[] args) {

        int targetMet = findsubarray(new int[] {2,3,1,2,4,3}, 7);

        System.out.println("the response is : " + targetMet);
    }



    static int findsubarray(int[] theArray, int tgt){
        int start = 0;
        int end = 1;
        int target = tgt;
        for(int i=0;i<theArray.length-1; i++){
            if(theArray[start] == target){
                return theArray[start];
            }else if(theArray[start] + theArray[end] != target){
                end ++;
            }else if(theArray[start] + theArray[end] == target) {
                return target;
            }else{
                start = i;

            }
        }
        return 0;
    }
}
