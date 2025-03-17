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

        String str1 = "아! 대한민국";
        String str2 = "Korea";
        System.out.println(str1 + str2);
        System.out.println("아! 대한민국 \nKorea");
        int a = 1000;
        int b = 2000;
        System.out.println(str1 + a + b + "리 금수강산 ");
        System.out.println(str1 + (a + b) + "리 금수강산 ");
        System.out.println(a + b + "리 금수강산");
        System.out.println('3' + "천리 금수강산");
        System.out.println('3' + 2997 + "리 금수강산");
    }
}
