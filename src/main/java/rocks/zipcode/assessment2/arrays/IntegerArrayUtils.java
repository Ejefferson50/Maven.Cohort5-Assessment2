package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(integerArray));
        arr.add(valueToBeAdded);
        Integer[] result = new Integer[arr.size()];
        result = arr.toArray(result);
        return result;


    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {


        return null;


    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {


        return integerArray[indexToFetch];


    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        ArrayList<Integer> oddBall = new ArrayList<>();
        for(int index = 0; index < integerArray.length; index++){
            if(integerArray[index] % 2 == 0){
                oddBall.add(integerArray[index] + 1);
            } else
                oddBall.add(integerArray[index]-1);
        }
        Integer[] result = oddBall.toArray(new Integer[oddBall.size()]);

        return result;




    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        ArrayList<Integer> oddBall = new ArrayList<>();
        for(int index = 0; index < integerArray.length; index++){
            if(integerArray[index] % 2 == 0){
                oddBall.add(integerArray[index] + 1);
            } else
                oddBall.add(integerArray[index]);
        }
        Integer[] result = oddBall.toArray(new Integer[oddBall.size()]);

        return result;

    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        ArrayList<Integer> oddBall = new ArrayList<>();
        for(int index = 0; index < input.length; index++){
            if(input[index] % 2 == 0){
                oddBall.add(input[index]);
            } else
                oddBall.add(input[index]-1);
        }
        Integer[] result = oddBall.toArray(new Integer[oddBall.size()]);

        return result;
    }
}
