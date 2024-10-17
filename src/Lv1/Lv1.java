package Lv1;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result;

        while (true) {
            System.out.println("첫번째 숫자를 입력해주세요.");
            int firstNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("사칙연산 기호를 입력해주세요. ");
            String operator = sc.nextLine();

            System.out.println("두번째 숫자를 입력해주세요.");
            int secondNumber = sc.nextInt();
            sc.nextLine();

            if (firstNumber < 0 || secondNumber < 0) {
                System.out.println("양수만 입력 가능합니다.");
                break;
            }

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println("결과 : " + result);
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println("결과 : " + result);
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println("결과 : " + result);
                    break;

                case "/":
                    if (secondNumber == 0) {
                        System.out.println("나눗셈에서 불가능한 입력 입니다.");
                        break;
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("결과 : " + result);
                        break;
                    }

                default:
                    System.out.println("unknown operation");
                    break;


            }

            System.out.println("더 계산하려면 enter 키를 눌러주세요. (exit 입력 시 종료)");
            String exit = sc.nextLine();

            if (exit.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;//while문 종료
            }//if
        }//while
    }//main

}//end
