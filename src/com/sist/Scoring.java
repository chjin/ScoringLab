package com.sist;

import java.util.Scanner;

/**
 * Created by cjw on 2016-03-03.
 */
public class Scoring {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("문제 수를 입력하세요.");
        int answer=scanner.nextInt();

        int i=0;
        int correct=0;
        int plus=0; //맞은 답수 증가 변수

        int[] arrayAnswer;
        arrayAnswer=new int[answer];

        int[] array;
        array=new int[answer];

        System.out.println("정답을 입력하세요: ");

        for(i=0;i<answer;i++){
            correct=scanner.nextInt();
            array[i]=correct;
        }

        System.out.print("답을 입력하세요 : ");

        for(i=0;i<answer;i++){
            correct=scanner.nextInt();
            arrayAnswer[i]=correct;

            if(array[i]==arrayAnswer[i]){
                System.out.print("O ");
                plus++;
            }else {
                System.out.print("X ");
            }
        }

        System.out.println("(맞은 개수 : " +plus +" 개)");
    }
}

















































