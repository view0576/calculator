package Lv2;

import Lv2.Lv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Lv2 calculator = new Lv2();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("첫번째 숫자를 입력해주세요.");
            int firstNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("사칙연산 기호를 입력해주세요.");
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
                    System.out.println("결과 : " + calculator.AddOperate(firstNumber, secondNumber));
                    break;

                case "-":
                    System.out.println("결과 : " + calculator.SubtractOperate(firstNumber, secondNumber));
                    break;

                case "*":
                    System.out.println("결과 : " + calculator.MultiplyOperate(firstNumber, secondNumber));
                    break;

                case "/":
                    if (secondNumber == 0) {
                        System.out.println("나눗셈에서 불가능한 입력 입니다.");
                        break;
                    } else {
                        System.out.println("결과 : " + calculator.DivideOperate(firstNumber, secondNumber));
                        break;
                    }

                default:
                    System.out.println("unknown operation");
                    break;
            }
            System.out.println("더 계산하려면 enter 키를 눌러주세요. (exit 입력 시 종료)");
            System.out.println("(가장 먼저 저장된 데이터를 삭제할경우 remove 입력)");
            System.out.println("(현재 저장된 데이터 값: " + calculator.result + ")");
            String finish = sc.nextLine();

            if (finish.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (finish.equals("remove")) {
                calculator.removeResult();
                System.out.println("데이터를 삭제했습니다. (현재 데이터 값: " + calculator.result + ")");

            }
        }
    }
}
