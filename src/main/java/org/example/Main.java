package org.example;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyLambda greetings = ()->System.out.println("Hello Lambda!");
        greetings.foo();
        MyAdd myAdd= (int a,int b)->a+b;
        System.out.println(myAdd.sum(3,5));
    }
}
interface MyLambda{
    void foo();
}
interface MyAdd{
    int sum(int a,int b);
}