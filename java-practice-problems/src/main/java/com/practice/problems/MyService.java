package com.practice.problems;

public class MyService {

    public void reverseString(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("Not a valid String!");
        }

        StringBuilder builder = new StringBuilder();
        char[] chArr = str.toCharArray();
        for(int i = chArr.length - 1 ; i >=0; i--){
            builder.append(chArr[i]);
        }

        System.out.println("Reversed String : "+builder.toString());

       /* Alternate solution which is short : using reverse() method
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        System.out.println("Reversed String : "+builder.reverse());*/
    }


    public void swapNumbers(int num1, int num2) {
        //1.using temp variable :
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 : "+ num1 + " num2 : "+num2);

        //2.without using temp variable :
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 : "+ num1 + " num2 : "+num2);
    }

    public boolean checkPalindrome(String str) {
        int length = str.length();
        for(int i=0; i<length/2; i++){
            if(str.charAt(i) != str.charAt(length - i -1)){
                return false;
            }
        }
        return true;
    }

    public void fibonacci(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 1; i <= count; i++){
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public int fibonacciByRecursion(int count) {
        if(count <= 1){
            return count;
        }

        return fibonacciByRecursion(count - 1) + fibonacciByRecursion(count - 2);
    }

    public String removeWhitespace(String str) {
        StringBuilder out = new StringBuilder();
        char[] arr = str.toCharArray();
        for(char i : arr){
            if(!Character.isWhitespace(i)){
                out.append(i);
            }
        }

        return out.toString();
    }

    public String removeWhiteSpaces(String str) {
        str = str.strip();
//        str = str.trim(); we can use trim method also
        return str;
    }
}
