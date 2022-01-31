package logicproblems;



public class almostIncreasingSequence {

    /*
    Given a sequence of integers as an array,
    determine whether it is possible to obtain a strictly increasing
    sequence by removing no more than one element from the array.

    Note: sequence a0, a1, ...,
    an is considered to be a strictly increasing if
    a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

    For sequence = [1, 3, 2], the output should be
    solution(sequence) = true.

     */

    public static boolean solution(int [] sequence){
        int counter = 0;

        for (int i = 0; i < sequence.length;i++){
            if (sequence[i-1] >= sequence[i]){
                counter++;
            }
            if (counter >1){
                return false;
            }
            if (i - 2 >= 0 && i + 1 < sequence.length &&
            sequence[i] <= sequence[i-2]
                    && sequence[i-1] >= sequence[i+1]){
                return false;
            }
        }
        return true;
    }





}
