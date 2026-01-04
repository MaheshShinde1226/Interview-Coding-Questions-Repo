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
}
