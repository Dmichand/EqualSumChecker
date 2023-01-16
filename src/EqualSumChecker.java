//Write a method hasEqualSum with 3 parameters of type int.
//
//The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
public class EqualSumChecker {
    public static boolean hasEqualSum(int number1,int number2,int inputSum){
        int realSum = number1 + number2;
        if(realSum == inputSum)
            return true;
        return false;
    }
}
