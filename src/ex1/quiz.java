package ex1;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    public void printSomething() {
        // Q1
        Scanner stdin = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int number = stdin.nextInt();

        if (number % 2 == 0 && number % 3 ==0) System.out.println(number + "는 2와 3의 배수입니다.");
        else if (number % 2 == 0) System.out.println(number + "는 2의 배수입니다.");
        else if (number % 3 == 0) System.out.println(number + "는 3의 배수입니다.");
        else System.out.println(number + "는 2의 배수와 3의 배수도 아닙니다.");

        // Q2
        Scanner stdin2 = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = stdin2.nextInt();

        if (score >= 80) {
                System.out.println("합격");
        } else if (score >= 60) {
                System.out.println("재시험");
        } else {
                System.out.println("불합격");
        }

        // Q3
        Scanner stdinNumber1 = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요.");
        int number1 = stdinNumber1.nextInt();

        Scanner stdinNumber2 = new Scanner(System.in);
        System.out.println("두 번째 정수를 입력하세요.");
        int number2 = stdinNumber2.nextInt();

        Scanner stdinNumber3 = new Scanner(System.in);
        System.out.println("세 번째 정수를 입력하세요.");
        int number3 = stdinNumber3.nextInt();

        int[] numbers = {number1, number2, number3};

        Arrays.sort(numbers);

        int max = numbers[numbers.length - 1];
        int min = numbers[0];
        double sum = number1 + number2 + number3;
        double avg = Math.round(sum / 3.0);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);

        // Q4
        Scanner stdinApple = new Scanner(System.in);
        System.out.println("구입할 사과의 개수를 입력하세요.");
        int apple = stdinApple.nextInt();
        int perPrice;

        if (apple < 10) perPrice = 1200;
        else if (apple < 40) perPrice = 1000;
        else perPrice = 800;
        
        int totalPrice = apple * perPrice;
        System.out.println("총 사과 가격: " + totalPrice);
    }
}




