package com.practice.problems;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyService service = new MyService();
        //1.Reverse a String in Java
//        service.reverseString("Hashmap");

        //2.Swap two numbers with and without using third variable
//        service.swapNumbers(2,4);

        //3.Check given String is palindrome or not
//        String str = "mahesh";
//        System.out.print(service.checkPalindrome(str));

        //4.Print fibonacci series for the first N numbers
        //We can do this by two methods :
        //i.Simple method ii.recursion
        //i.Simple Method :
//        int count = 10;
//        service.fibonacci(10);
        //ii.by recursion
//        for(int i = 0; i < count; i++){
//            System.out.print(service.fibonacciByRecursion(i) + ", ");
//        }

        //5.Remove whitespaces from String
//        System.out.print(service.removeWhitespace("Mah esh"));

        //6.Remove trailing whitespace by two methods trim() & strip()
        System.out.print(service.removeWhiteSpaces(" Mahesh "));
    }
}