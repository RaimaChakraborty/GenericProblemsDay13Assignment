package com.generics;
import java.util.Scanner;
public class FindMaximumInteger <T extends Comparable<T>>
{public static <T extends Comparable<T>> T maximumCheck(T number1, T number2, T number3)
{
    T maxnum = number1;
    if(number2.compareTo(maxnum) > 0) {
        maxnum = number2;
    }
    if(number3.compareTo(maxnum) > 0) {
        maxnum = number3;
    }
    return maxnum;
}
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int number1 = read.nextInt();
        int number2 = read.nextInt();
        int number3 = read.nextInt();

        System.out.println("Max value is: " +  maximumCheck(number1, number2, number3));
    }

}