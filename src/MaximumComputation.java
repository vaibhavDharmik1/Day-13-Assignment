public class MaximumComputation<T extends Comparable<T>> {

    T toCompare1, toCompare2, toCompare3;

    public MaximumComputation(T tocompare1, T tocompare2, T tocompare3) {
        this.toCompare1 = tocompare1;
        this.toCompare2 = tocompare2;
        this.toCompare3 = tocompare3;
    }

    public void testMaximum() {
        MaximumComputation.findMaximum(this.toCompare1, this.toCompare2, this.toCompare3);
    }

    public static <T extends Comparable<T>> void findMaximum(T firstNumber, T secondNumber, T thirdNumber) {
        T maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }

        System.out.println("The maximum number is: " + maximumNumber);
    }



    public static void main(String[] args) {

        System.out.println(" Welcome To Maximum Computation Of Three Numbers Using Java Generics ");

        Integer firstNumber = 15, secondNumber = 22, thirdNumber = 27;
        Float number1 = 13f, number2 = 9f, number3 = 5f;
        String firstString = "Rahul", secondString = "Dravid", thirdString = "vaibhav";

        new MaximumComputation<Integer>(firstNumber, secondNumber, thirdNumber).testMaximum();
        new MaximumComputation<Float>(number1, number2, number3).testMaximum();
        new MaximumComputation<String>(firstString, secondString, thirdString).testMaximum();

    }


}