package com.mycompany.argumentlist;

/**
 *
 * @author Naweed
 */

public class ArgumentList {
    public static void main(String[] args) {
        System.out.println(product(2, 4, 6, 8)); // Output: 384
        System.out.println(product(3, 5, 7)); // Output: 105
        System.out.println(product(1, 2)); // Output: 2
    }
    
    public static int product(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}
