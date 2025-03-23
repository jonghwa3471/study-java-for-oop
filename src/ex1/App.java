package ex1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
/*         int u_price = -300;
        int count = 9;

        System.out.printf("%d원짜리 %d개를 사면 %d입니다\n", 300, 9, 300 * 9);
        System.out.printf("%10d원짜리 %+10d개를 사면 %10d입니다\n", u_price, count, u_price * count);
        System.out.printf("10진수 15를 16진수로 출력하면 : %x, 8진수로 출력하면 : %o\n", 15, 15);
        System.out.printf("음수값 -10을 %%d로 출력하면 %d\n", -10); */

/*         double r = 5.0;
        double pi = 3.14159;

        System.out.printf("반지름이 %f인 원의 넓이는 %f입니다\n", 5.0, 3.14159*5*5);
        System.out.printf("반지름이 %f인 원의 넓이는 %f입니다\n", r, pi*r*r);
        System.out.printf("반지름이 %e인 원의 넓이는 %e입니다\n", r, pi*r*r);

        System.out.printf("123.456을 %%f로 : %f\n", 123.456);
        System.out.printf("123.456을 %%e로 : %e\n", 123.456);
        System.out.printf("-123.456을 %%E로 : %E\n", -123.456); */

/*         char ch1 = 'A';
        String name = "홍길동";

        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "AB");
        System.out.printf("%s\n", "AB CCCCC");
        System.out.printf("%s씨 %s\n%s\n", name, "재미있는 자바언어", "열심히 하세요"); */

/*         byte b = 120;
        int i = b;
        System.out.println("확대 형 변환 : "+i);
        int j = 259;
        double d = 259.428;
        System.out.println("축소 형 변환 결과");
        b = (byte) j;
        System.out.println("int 259를 byte로 : " + b);
        i = (int) d;
        System.out.println("double 259.428을 int로 : " + i);
        b = (byte) d;
        System.out.println("double 259.428을 byte로 : " + b); */

/*         int a = 5, b = 2;

        int sum = a + b;
        System.out.println("a + b =" + sum);

        int sub = a - b;
        System.out.println("a - b =" + sub);

        int mul = a * b;
        System.out.println("a * b =" + mul);

        int div = a / b;
        System.out.println("a / b =" + div);

        int mod = a % b;
        System.out.println("a % b =" + mod);

        int c = ++a;
        System.out.println("a의 전위 증가 연산(prefix)="+c);
        System.out.println("a 변수의 값 : "+a);

        int d = b++;
        System.out.println("b의 후위 증가 연산(postfix)=" +d);
        System.out.println("b 변수의 값 : "+b); */

/*         boolean a;
        a = (20 > 10) || (30 > 40);
        System.out.println("20이 10보다 크거나 또는(논리합 ||) 30이 40보다 큰가? " +a);
        
        a = (20 > 10) && (30 > 40);
        System.out.println("20이 10보다 크고 그리고(논리곱 &&) 30이 40보다 큰가? " +a);

        a = ! true;
        System.out.println("true의 !(not)은? " + a);
        System.out.println("20이 10보다 크거나 또는(논리합 ||) 30이 40보다 큰가? " + ((20 > 10) || (30 > 40)));
        System.out.println("20이 10보다 크고 그리고(논리곱 &&) 30이 40보다 큰가? " + ((20 > 10) && (30 > 40)));
        System.out.println("true의 !(not)은? " + (! true)); */

/*         int a = 14;
        int b = 11;
        System.out.println("a = "+a+"("+Integer.toBinaryString(a)+")");
        System.out.println("b = "+b+"("+Integer.toBinaryString(b)+")");
        System.out.println("a&b = "+(a&b)+"("+Integer.toBinaryString(a&b)+")");
        System.out.println("a|b = "+(a|b)+"("+Integer.toBinaryString(a|b)+")");
        System.out.println("a^b = "+(a^b)+"("+Integer.toBinaryString(a^b)+")");
        System.out.println("~b = "+(~b)+"("+Integer.toBinaryString(~b)+")"); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.print("두 개의 숫자를 입력 : ");

        int a = stdin.nextInt();
        int b = stdin.nextInt();

        System.out.println("a = " +a+"("+Integer.toBinaryString(a)+")");
        System.out.println("b = " +b+"("+Integer.toBinaryString(b)+")");
        System.out.println("a<<2 = " +(a<<2)+"("+Integer.toBinaryString(a<<2)+")");
        System.out.println("a>>2 = " +(a>>2)+"("+Integer.toBinaryString(a>>2)+")");
        System.out.println("b<<2 = " +(b<<2)+"("+Integer.toBinaryString(b<<2)+")");
        System.out.println("b>>2 = " +(b>>2)+"("+Integer.toBinaryString(b>>2)+")");
        System.out.println("b>>>2 = " +(b>>>2)+"("+Integer.toBinaryString(b>>>2)+")"); */

/*         boolean flag;
        int a = 11;
        flag = a >= 10 ? true : false;
        System.out.println(flag);

        int count = 10;
        System.out.println(count != 10 ? "10이 아님" : "10을 가짐");

        int b = -10;
        b = b >= 0 ? b * b : -b * -b;
        System.out.println(b); */

/*         String str1 = "아! 대한민국";
        String str2 = "Korea";
        System.out.println(str1 + str2);
        System.out.println("아! 대한민국 \nKorea");
        int a = 1000;
        int b = 2000;
        System.out.println(str1 + a + b + "리 금수강산 ");
        System.out.println(str1 + (a + b) + "리 금수강산 ");
        System.out.println(a + b + "리 금수강산");
        System.out.println('3' + "천리 금수강산");
        System.out.println('3' + 2997 + "리 금수강산"); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("성적을 입력하세요 : ");
        int grade = stdin.nextInt();
        if (grade >= 90)
                System.out.println("축하합니다");
                System.out.println("A학점을 취득하셨습니다");
        System.out.println("감사합니다"); */

        /* Scanner stdin = new Scanner(System.in);
        System.out.println("성적을 입력하세요 : ");
        int grade = stdin.nextInt();
        if (grade >= 90)
                System.out.println("A학점 취득 성공");
        else    
                System.out.println("A학점 취득 실패");
        System.out.println("감사합니다"); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("성적을 입력하세요 : ");
        int grade = stdin.nextInt();
        if (grade >= 90)
                System.out.println("A학점 취득");
        else if (grade >= 80)
                System.out.println("B학점 취득");
        else if (grade >= 70)
                System.out.println("C학점 취득");
        else if (grade >= 60)
                System.out.println("D학점 취득");
        else            
                System.out.println("학점 취득 실패"); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("성적을 입력하세요 : ");
        int score = stdin.nextInt();
        if (score >= 80) {
                System.out.println("우수 학점군에 속합니다");
                if( score >= 90)
                        System.out.println("A학점입니다");
                else
                        System.out.println("B학점입니다");
        }
        else {
                if (score >= 60) {
                        System.out.println("보통 학점군에 속합니다");
                        if (score >= 70)
                                System.out.println("C학점입니다");
                        else
                                System.out.println("D학점입니다");
                }
                else
                        System.out.println("학점 취득 실패");
        } */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("월을 입력하세요 : ");
        int month = stdin.nextInt();
        String MtoS;
        switch (month){
                case 12:
                case 1:
                case 2:
                        MtoS = "겨울입니다.";
                        break;
                case 3:
                case 4:
                case 5:
                        MtoS = "봄입니다.";
                        break;
                case 6:
                case 7:
                case 8:
                        MtoS = "여름입니다.";
                        break;
                case 9:
                        System.out.println("멋진 9월과 ");
                case 10:
                        System.out.println("아름다운 10월과 ");
                case 11:
                        System.out.println("낙엽의 11월은 ");
                        MtoS = "가을입니다.";
                        break;
                default:
                        MtoS = "1~12월을 벗어난 달입니다.";
                        break;
        }
        System.out.println(MtoS); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("월을 입력하세요(영문자) : ");
        String month = stdin.next();
        String MtoS;
        switch (month) {
                case "December":
                case "January":
                case "February":
                        MtoS = "겨울입니다.";
                        break;
                case "March":
                case "April":
                case "May":
                        MtoS = "봄입니다.";
                        break;
                case "June":
                case "July":
                case "August":
                        MtoS = "여름입니다.";
                        break;
                case "September":
                        System.out.println("멋진 9월과 ");
                case "October":
                        System.out.println("아름다운 10월과 ");
                case "November":
                        System.out.println("낙엽의 11월은 ");
                        MtoS = "가을입니다.";
                        break;
                default:
                        MtoS = "1~12월을 벗어난 달입니다.";
                        break;
        }
        System.out.println(MtoS); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("원하는 단을 입력하세요 : ");
        int dan = stdin.nextInt();
        int x = 1;
        while (x <= 9) {
                System.out.println(dan + "*" + x + "=" + dan * x);
                x++;
        } */

/*         int hap = 0, count = 1;
        do {
                hap = hap + count;
                count = count + 1;
        } while (count <= 10);
        System.out.println("1부터 10까지의 합은 "+ hap + " 입니다"); */

/*         int choice;
        Scanner stdin = new Scanner(System.in);
        do {
                System.out.println("=== 반복문 종류 설명 ===");
                System.out.println(" 1. while 반복문");
                System.out.println(" 2. do-while 반복문");
                System.out.println(" 3. for 반복문");
                System.out.println("끝내시려면 99를 입력하세요");
                System.out.println("원하는 번호를 입력하세요 : ");
                choice = stdin.nextInt();
                switch(choice) {
                        case 1:
                                System.out.println("****while 반복문****");
                                System.out.println("조건을 먼저 검사하고 조건이 참일 경우 반복 부분을 수행하는 반복문");
                                break;
                        case 2:
                                System.out.println("****do-while 반복문****");
                                System.out.println("반복 부분을 먼저 수행하고 조건을 검사한다. 최소한 한 번은 수행되는 반복문");
                                break;
                        case 3:
                                System.out.println("****for 반복문****");
                                System.out.println("지정된 횟수만큼 반복 부분을 수행하는 반복문");
                                break;
                        case 99:
                                System.out.println("사용해 주셔서 감사합니다.");
                                break;
                        default:
                                System.out.println("숫자를 잘못 입력하셨습니다.");
                }
                System.out.println();
        } while (choice != 99); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요(공백으로 구분) : ");
        int m = stdin.nextInt();
        int n = stdin.nextInt();
        int i;
        for (i = 1; i <= m * n; i++) {
                if ((i % n == 0) && (i % m == 0))
                        break;
        }
        System.out.println("최소 공배수는 " + i + "입니다.");
        for (i = n; i >= 1; i--) {
                if((m % i == 0) && (n % i == 0))
                        break;
        }
        if (i == 1)
                System.out.println("최대 공약수가 없습니다.");
        else   
                System.out.println("최대 공약수는 " + i + "입니다."); */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("원하는 숫자를 입력하세요 : ");
        int num = stdin.nextInt();
        int i = 1;
        while (i <= num) {
                int j = 1;
                while (j <= i) {
                        System.out.println("*");
                        j++;
                }
                System.out.println();
                i++;
        } */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("합계를 원하는 정수 입력 : ");
        int num = stdin.nextInt();
        int sum = 0, i = 1;
        while (true) {
                sum = sum + i;
                if (i == num) break;
                i++;
        }
        System.out.println(num + "까지의 합계는 = " + sum); */

/*         int i = 2, j;
        Loop : while (true) {
                j = 1;
                if (i < 10)
                        System.out.println("\n=== " + i + "단 ===");
                Innerloop : while (true) {
                        if (j > 9) break;
                        if (i > 9) break Loop;
                        System.out.println(i + "*" + j + "=" + i * j);
                        j++;
                }
                System.out.println();
                i++;
        } */

/*         Scanner stdin = new Scanner(System.in);
        System.out.println("원하는 정수 입력(짝수의 합) : ");
        int num = stdin.nextInt();
        int i, sum = 0;
        for (i = 1; i <= num; i++) {
                if (i % 2 == 1) continue;
                sum = sum + i;
        }
        System.out.println("1부터 " + num + "까지 짝수의 합 = " + sum); */

        int i, j;
        Outer : for (i = 2; i <= 9; i = i + 1) {
                System.out.println("===" + i + "단===");
                for (j = 1; j <= 9; j = j + 1) {
                        if (j == 3) continue Outer;
                        System.out.println(i + "*" + j + "=" + i * j);
                }
        }
    }
}
