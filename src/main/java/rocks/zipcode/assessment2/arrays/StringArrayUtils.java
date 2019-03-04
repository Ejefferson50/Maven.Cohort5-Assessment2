package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        ArrayList<String> stringList = new ArrayList<>();
        for (int index = startingIndex; index < endingIndex; index++){
            stringList.add(arrayToBeSpliced[index]);
        }
        String[] result = stringList.toArray(new String[stringList.size()]);
        return result;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        ArrayList<String> stringList = new ArrayList<>();
        for (int index = startingIndex; index < arrayToBeSpliced.length; index++){
            stringList.add(arrayToBeSpliced[index]);
        }
        String[] result = stringList.toArray(new String[stringList.size()]);
        return result;
    }
}
