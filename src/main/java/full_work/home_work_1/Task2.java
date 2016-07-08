package full_work.home_work_1;

import static java.lang.Math.pow;

/**
 * Home_work_1
 * Task 2 - Circle, data type
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 1 ; i < array.length; i++){
            array[i]=i;
        }
        for (int i = 0 ; i < Task2.minIndex(array); i++){
            System.out.println("array: "+array[i]);
        }
        System.out.println(Math.exp(1));


    }

    public static int minIndex(int[] array){
        double value = Double.MAX_VALUE;
        int returnValue = -1;
        for (int i = 0 ; i<array.length; i++){

            value =(1.0/pow((i+1),2));
            //System.out.println("Value: "+value);

            if(value<Math.exp(1)){
                returnValue=i;
            }else {
                break;
            }
        }

        return returnValue;


    }



}
