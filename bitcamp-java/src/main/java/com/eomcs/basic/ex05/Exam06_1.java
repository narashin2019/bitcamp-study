package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 증가 연산자 

public class Exam06_1 {
    public static void main(String[] args) {
        int i = 2;

        i++;
        // 현재 위치에 i 메모리에 들어 있는 값을 꺼내 놓는다. 
        // i 메모리의 값을 1 증가시킨다.
        // 증가시킨 값을 다시 i에 넣는다.
        
        i++;

        System.out.println(i);

        System.out.println(i++);
        // 현재 i값 출력하고 나서 그 담에!! 1이 증가한다.
        // System.out.println(4);
        // i = i + 1;
        
        System.out.println(i);

    }
}