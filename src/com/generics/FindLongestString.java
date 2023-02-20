package com.generics;
import java.util.Scanner;
public class FindLongestString <T extends Comparable<T>> {
    public static <T extends Comparable<T>> T maximumCheck(T string1, T string2, T string3)
    {
        T maxstring = string1;
        if(string2.compareTo(maxstring) > 0) {
            maxstring = string2;
        }
        if(string3.compareTo(maxstring) > 0) {
            maxstring = string3;
        }
        return maxstring;
    }
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        String string1 = read.next();
        String string2 = read.next();
        String string3 = read.next();

        System.out.println("Longest String is: " +  maximumCheck(string1, string2, string3));
    }
}
