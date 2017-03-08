package com.theironyard;

/**
 * This class contains two static methods. Static methods are methods that
 * belong to a particular class, not an instance of an object. They can be
 * invoked from the class itself, not just an instance of the class. However,
 * you won't need to worry about those details right now. Your job is to simply
 * write the code that goes in these methods. Follow the instructions below.
 *
 */
public class ForLoopExercises {

    /**
     * This method adds up all of the numbers in a range, stepping by the
     * specified increment. It accepts three integers. The first two, from and
     * to, indicate a range of values. IE: from 1 to 10 or from 5 to -3. The
     * third argument, step, indicates an amount to step by. So, from = 1,
     * to = 10, and step = 1, means the method will add up 1, 2, 3, 4, 5, 6, 7,
     * 8, 9, 10. Or, from = 12, to = -3, and step = 3, means the method will add
     * up 12, 9, 6, 3, 0, -3. The sum is returned.
     */
    public static int addRange(int from, int to, int step){
        // todo: implement this method using a for loop
        int sum = 0;
        for(int i  = from; i <= to; i = i + step){
            sum +=i;
        }
        return sum;
    }

    /**
     * This method returns the specified string a given number of times. The str
     * argument is the string to repeat. The times argument is the number of
     * times to repeat. For example, str = "cat dog", times = 3 will return the
     * string "cat dogcat dogcat dog".
     */
    public static String repeatString(String str, int times){
        // todo: implement this method
        String newString="";
        for(int i = 1; i <= times;i++){
            newString += str;
        }
        return newString;
    }

}
