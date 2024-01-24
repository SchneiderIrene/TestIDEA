package io_streams;

import lambda.IsMoreInterface;
import lambda.Operationable;

public class Mail {

    public static void main(String[] args) {
        Operationable<Integer> operationable = (x, y) -> x+y;
        System.out.println(operationable.calculate(1,2));

        Operationable<String> operationable1 = (x, y) -> x+y;
        System.out.println(operationable1.calculate("1", "2"));

        int [] ints = {10, 20, 30, 40, 50};
        IsMoreInterface isMoreInterface = num -> num > 20;

        System.out.println(isMoreInterface.isMore(15));
        System.out.println(isMoreInterface.isMore(25));

        System.out.println(sumIfCond(ints, isMoreInterface));

        isMoreInterface = num -> num > 10;
        System.out.println(sumIfCond(ints, isMoreInterface));
    }

    public  static int sumIfCond (int[]ints, IsMoreInterface lambdaEx){
        int sum = 0;
        for (int el: ints){
            if (lambdaEx.isMore(el)){
                sum+=el;
            }
        }
        return sum;
    }
}
