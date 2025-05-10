package ex1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Study {
    public void examples() {
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

/*         int i, j;
        Outer : for (i = 2; i <= 9; i = i + 1) {
                System.out.println("===" + i + "단===");
                for (j = 1; j <= 9; j = j + 1) {
                        if (j == 3) continue Outer;
                        System.out.println(i + "*" + j + "=" + i * j);
                }
        } */

/*         Scanner stdin = new Scanner(System.in);
        int i;
        double sum = 0.0, avg;
        double dnum[] = new double[5];
        System.out.println("dnum 배열의 길이 : " + dnum.length);
        System.out.println("초기화 하지 않은 dnum[]의 값: ");
        for (i = 0; i < dnum.length; i++)
                System.out.println(dnum[i]+" ");
        System.out.println();

        for (i = 0; i < dnum.length; i++) {
                System.out.println("dnum["+i+"] 번째 데이터 입력 : ");
                dnum[i] = stdin.nextDouble();
        }
        for (i = 0; i < dnum.length; i++)
                sum = sum + dnum[i];
        System.out.println("배열의 합은 " + sum + "입니다");
        avg = sum/dnum.length;
        System.out.println("배열 값의 평균은 " + avg + "입니다"); */

/*         int[] score = {88, 97, 53, 62, 92, 68, 82};
        int max = score[0];
        for (int i : score) {
                if (i > max)
                        max = i;
        }
        System.out.println("배열 요소의 최대값은 " + max + "입니다"); */

/*         int[] num1 = {10, 20, 30};
        int[] num2 = {40, 50, 60};
        num2 = num1;
        num2[2] = 200;
        System.out.println("num1 배열의 값 : ");
        for (int i : num1)
                System.out.println(i + " ");
        System.out.println("\nnum2 배열의 값 : ");
        for (int i : num2)
                System.out.println(i + " ");
        int num3[] = {100, 200, 300};
        int num4[] = {400, 500, 600};
        for (int i = 0; i < num3.length; i++)
                num4[i] = num3[i];
        num4[2] = 999;
        System.out.println("\nnum3 배열의 값 : ");
        for (int i : num3)
                System.out.println(i + " ");
        System.out.println("\nnum4 배열의 값 : ");
        for (int i : num4)
                System.out.println(i + " "); */

/*         int[][] twoD = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        System.out.println("2차원 배열에서 행의 길이는 : " + twoD.length);
        System.out.println("첫 번째 행의 요소 수는 : " + twoD[0].length);
        System.out.println("두 번째 행의 요소 수는 : " + twoD[1].length);
        System.out.println("세 번째 행의 요소 수는 : " + twoD[2].length);
        System.out.println("네 번째 행의 요소 수는 : " + twoD[3].length);
        int i, j, k = 0;
        for (i = 0; i < twoD.length; i++)
                for (j = 0; j < twoD[i].length; j++) {
                        twoD[i][j] = k;
                        k++;
                }
        for (i = 0; i < twoD.length; i++) {
                for (int val: twoD[i])
                        System.out.println(val + " ");
                System.out.println();
        } */

/*         int[] int1 = {9, 1, 7, 3, 5, 4, 6, 2, 8, 0};
        System.out.println("초기배열 : " + Arrays.toString(int1));
        Arrays.fill(int1, 3, 5,33);
        System.out.println("fill() 수행 후 : " + Arrays.toString(int1));
        Arrays.sort(int1);
        System.out.println("33은 배열의" + Arrays.binarySearch(int1, 33) + "번째 요소");
        int[] int2 = {5, 4, 3, 2, 1};
        System.out.println("두 번째 배열 : " + Arrays.toString(int2));
        System.out.println("두 개의 배열이 같은가?" + Arrays.equals(int1, int2));
        int[] int3 = new int[5];
        System.arraycopy(int2, 0, int3, 0, 5);
        System.out.println("복사된 배열 : " + Arrays.toString(int3)); */

/*         String[] array1 = {"IMF", "제주도", "자바도사", "한글나라", "Computer", "모카", "JAVA", "인터넷탐색", "초롱초롱", "come", "바람", "스크립터", "군고구마", "도서", "their", "country"};
        System.out.println("===== 정렬 전 데이터 =====");
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("===== 정렬 후 데이터 =====");
        System.out.println(Arrays.toString(array1));
        System.out.println("군고구마는 배열의 " + Arrays.binarySearch(array1, "군고구마") + "번째 요소");
        String[] array2 = array1;
        System.out.println("array1과 array2가 같은가? : " + Arrays.equals(array1, array2));
        String[] array3 = new String[20];
        System.arraycopy(array2, 0, array3, 0, array2.length);
        System.out.println("array3 배열 : " + Arrays.toString(array3)); */

/*         class Box1 {
                int width;
                int height;
                int depth;
        }

        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        int vol1, vol2;

        mybox1.width = 78;
        mybox1.height = 145;
        mybox1.depth = 87;

        mybox2.width = 48;
        mybox2.height = 45;
        mybox2.depth = 137;

        vol1 = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("첫 번째 박스의 부피는 " + vol1 + "입니다");

        vol2 = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("두 번째 박스의 부피는 " + vol2 + "입니다"); */

/*         class Box2 {
                int width = 10;
                int height = 20;
                int depth = 30;
        }

        int myint1 = 100;
        int myint2 = myint1;
        System.out.println("첫 번째 값 : " + myint1 + "두 번째 값 :" + myint2);
        myint1 = 200;
        System.out.println("첫 번째 값 : " + myint1 + "두 번째 값 : " + myint2);
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        mybox1.width = 20;
        mybox2.depth = 123;
        System.out.println("mybox1.width : " + mybox1.width);
        System.out.println("mybox1.height : " + mybox1.height);
        System.out.println("mybox1.depth : " + mybox1.depth);

        System.out.println("mybox2.width : " + mybox2.width);
        System.out.println("mybox2.height : " + mybox2.height);
        System.out.println("mybox2.depth : " + mybox2.depth);

        Box2 mybox3 = mybox2;
        mybox2.width = 1000;
        mybox2.height = 2000;
        System.out.println("mybox3.width : " + mybox3.width);
        System.out.println("mybox3.height : " + mybox3.height);
        System.out.println("mybox3.depth : " + mybox3.depth); */

/*         class Initial {
                int number;
                double rate;
                String name;
                int[] score;
                public void aMethod() {
                        int count;
                        System.out.println(number);
                }
        }

        int var1;
        double var2;
        Initial ob1 = new Initial();
        System.out.println("객체 변수 number의 값은 : " + ob1.number);
        System.out.println("객체 변수 rate의 값은 : " + ob1.rate);
        System.out.println("객체 변수 name 값은 : " + ob1.name);
        System.out.println("객체 변수 score 값은 : " + ob1.score);
        ob1.aMethod(); */

/*         class Box3 {
            int width;
            int height;
            int depth;
            long idNum;
            static long boxID = 0;
            public Box3() {
                    idNum = ++boxID;
            }
    }

    Box3 mybox1 = new Box3();
    Box3 mybox2 = new Box3();
    Box3 mybox3 = new Box3();
    Box3 mybox4 = new Box3();

    System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
    System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
    System.out.println("mybox3의 id 번호 : " + mybox3.idNum);
    System.out.println("mybox4의 id 번호 : " + mybox4.idNum);
    System.out.println("마지막 생성된 박스 번호는 " + Box3.boxID + "번 입니다."); */

/*     class Box4 {
        int width;
        int height;
        int depth;
        public Box4(int w, int h, int d) {
                width = w;
                height = h;
                depth = d;
        }
    }

    Box4 mybox1 = new Box4(10, 20, 30);
    // Box4 mybox2 = new Box4();
    int vol = mybox1.width * mybox1.height * mybox1.depth;
    System.out.println("박스의 부피 : " + vol); */

/*     class Box5 {
        int width;
        int height;
        int depth;
        public Box5() {
                width = 1;
                height = 1;
                depth = 1;
        }
        public Box5(int w) {
                width = w;
                height = 1;
                depth = 1;
        }
        public Box5(int w, int h) {
                width = w;
                height = h;
                depth = 1;
        }
        public Box5(int w, int h, int d) {
                width = w;
                height = h;
                depth = d;
        }
        } */
/*        class Box7 {
                int width;
                int height;
                int depth;
                public Box7() {
                        this(1, 1, 1);
                        System.out.println("매개 변수 없는 생성자 수행");
                }
                public Box7(int width) {
                        this(width, 1, 1);
                        System.out.println("매개 변수(1개) 생성자 수행");
                }
                public Box7(int width, int height) {
                        this(width, height, 1);
                        System.out.println("매개 변수(2개) 생성자 수행");
                }
                public Box7(int width, int height, int depth) {
                        System.out.println("매개 변수(3개) 생성자 수행");
                        this.width = width;
                        this.height = height;
                        this.depth = depth;
                }
       } */

/*        class Box10 {
                private int width;
                private int height;
                private int depth;
                private int vol;
                private long idNum;
                private static long boxId;
                public Box10(int width, int height, int depth) {
                        this.width = width;
                        this.height = height;
                        this.depth = depth;
                        idNum = ++boxId;
                        volume();
                }
                private void volume() {
                        vol = width * height * depth;
                }
                public String getVolume() {
                        return idNum + "번 박스의 부피 : " + vol;
                }
                public static long getCurrentId() {
                        // return idNum;
                        return boxId;
                }
       }
       Box10 mybox1;
       for (int i = 1; i <= 5; i++) {
                mybox1 = new Box10(i, i +1, i+2);
                System.out.println(mybox1.getVolume());
       }
       System.out.println("마지막 생성된 박스 번호는 " + Box10.getCurrentId() + "번입니다."); */
       // System.out.println(Box10.boxId);
       // 여기에서는 같은 클래스 내에 있기 때문에 잘 실행이 되지만, 외부 클래스에선 static에 접근이 불가능하다.
       // 클래스 내부에(혹은 메서드) 새로운 클래스를 생성하고 그 내부에 private을 생성하는 것은 의미가 없다.
       // 내부에 private으로 생성해도 같은 클래스(외부가 아닌) 혹은 메서드 내에 있다면 아무리 다른 클래스에서 접근을 하더라도, 결국엔 같은 곳에 있는 판정이기 때문이다.

/*         class Box11 {
        private int ivol;
        private double dvol;
        public Box11(int w, int h, int d) {
                volume(w, h, d);
        }
        public Box11(double w, double h, double d) {
                volume(w, h, d);
        }
        private void volume(int w, int h, int d) {
                ivol = w * h * d;
        }
        private void volume(double w, double h, double d) {
                dvol = w * h * d;
        }
        public int get_ivol() {
                return ivol;
        }
        public double get_dvol() {
                return dvol;
        }
       }
       Box11 mybox1 = new Box11(10, 20, 30);
       System.out.println("박스의 부피(정수 매개 변수) : " + mybox1.get_ivol());
       
       mybox1 = new Box11(10.5, 20.5, 30.5);
       System.out.println("박스의 부피(실수 매개 변수) : " + mybox1.get_dvol());

       mybox1 = new Box11(10, 20 , 30.5);
       System.out.println("박스의 부피(정수와 실수 혼합): " + mybox1.get_dvol()); */

/*        class Ramyon {
        String ramyon = "라면";
        String water = "물";
        String onion = "파";
        void boilWater() {
                System.out.println(water + "를 끓인다.");
        }
        void cooking() {
                System.out.println(ramyon + "과 " + onion + "을 넣고 끓여 요리완성. 맛있게 드세요!!!");
        }
       }

       class RiceRamyon extends Ramyon {
        String topp = "떡";
        void topping() {
                System.out.println(topp + "을 넣는다.");
        }

       }
       class CheeseRamyon extends Ramyon {
        String topp = "치즈";
        void topping() {
                System.out.println(topp + "을 넣는다.");
         }
        }
        int s;
        do {
                System.out.println("만들고 싶은 요리를 입력하세요(1: 일반라면, 2:떡라면, 3:치즈라면, 99:종료");
                Scanner stdin = new Scanner(System.in);
                s = stdin.nextInt();
                if (s == 1) {
                        Ramyon r = new Ramyon();
                        r.boilWater();
                        r.cooking();
                } else if (s == 2) {
                        RiceRamyon rr = new RiceRamyon();
                        rr.boilWater();
                        rr.topping();
                        rr.cooking();
                } else if (s == 3) {
                        CheeseRamyon cr = new CheeseRamyon();
                        cr.boilWater();
                        cr.topping();
                        cr.cooking();
                } 
        } while (s != 99);
        System.out.println("감사합니다."); */

/*         class B1 {
                public int x = 500;
                public int y = 1000;
        }
        class B2 extends B1 {
                public String x = "처음 시작하는 자바";
        }
        B2 b2 = new B2();
        System.out.println("객체 b2에 들어 있는 x, y 값 : " + b2.x + b2.y);
        B1 b1 = new B1();
        System.out.println("객체 b1에 들어 있는 x, y 값 : " + b1.x + b1.y); */

/*         class DA1 {
                public double d1;
                public DA1() {
                        System.out.println("클래스 DA1의 묵시적 생성자 수행");
                        d1 = 10 * 10;
                }
        }
        
        class DA2 extends DA1 {
                public double d2;
                public DA2() {
                        System.out.println("클래스 DA2의 묵시적 생성자 수행");
                        d2 = 10 * 10 * 10;
                }
        }
        class DA3 extends DA2 {
                public double d3;
                public DA3() {
                        System.out.println("클래스 DA3의 묵시적 생성자 수행");
                        d3 = 10 * 10 * 10;
                }
        }
        DA3 super1 = new DA3();
        System.out.println("10의 2제곱 : " + super1.d1);
        System.out.println("10의 3제곱 : " + super1.d2);
        System.out.println("10의 4제곱 : " + super1.d3);
        DA2 super2 = new DA2(); */

/*         class DB1 {
                public double d1;
                public DB1() {
                        System.out.println("클래스 DB1의 묵시적 생성자 수행");
                        d1 = 10 * 10;
                }
        }
        class DB2 extends DB1 {
                public double d2;
                public DB2() {
                        System.out.println("클래스 DB2의 묵시적 생성자 수행");
                        d2 = 10 * 10 * 10;
                }
                public DB2(double d) {
                        System.out.println("클래스 DB2의 명시적 생성자 수행");
                        d2 = d * d * d;
                }
        }
        class DB3 extends DB2 {
                public double d3;
                public DB3() {
                        System.out.println("클래스 DB3의 묵시적 생성자 수행");
                        d3 = 10 * 10 * 10* 10;
                }
                public DB3(double d) {
                        System.out.println("클래스 DB3의 명시적(매개 변수 1개) 생성자 수행");
                        d3 = d * d * d * d;
                }
        }
        DB3 super1 = new DB3(11);
        System.out.println("10의 2제곱 : " + super1.d1);
        System.out.println("10의 3제곱 : " + super1.d2);
        System.out.println("10의 4제곱 : " + super1.d3); */

/*         class OIa {
                public void show(String str) {
                        System.out.println("상위 클래스의 메소드 show(String str) 수행 " + str);
                }
        }

        class OIb extends OIa {
                public void show() {
                        System.out.println("하위 클래스의 메소드 show() 수행");
                }
        }
        OIb oib = new OIb();
        oib.show("처음 시작하는 자바");
        oib.show(); */

/*         class SB1 {
                public int x = 500;
                public int y = 1000;
        }
        class SB2 extends SB1 {
                public String x = "처음 시작하는 자바";
                public String xx = x + super.x;
                public String yy = "" + y + super.y;
        }
        SB2 sb2 = new SB2();
        System.out.println("객체 sb2에 들어 있는 x, y값: " + sb2.x + sb2.y);
        // sb2.super.x 이와 같은 사용은 허용 안 됨.
        System.out.println("객체 sb2에 들어있는 xx 값 : " + sb2.xx);
        System.out.println("객체 sb2에 들어있는 yy 값 : " + sb2.yy); */

/*         class D1 {
                public int x = 1000;
                public void display() {
                        System.out.println("상위 클래스 D1의 display() 메소드입니다");
                }
        }
        class D2 extends D1 {
                public int x = 2000;
                public void display() {
                        System.out.println("하위 클래스 D2의 display() 메소드입니다");
                }
                public void write() {
                        display();
                        super.display();
                        System.out.println("D2 클래스 객체의 x 값은 : " + x);
                        System.out.println("D1 클래스 객체의 x 값은 : " + super.x);
                }
        }
        D2 d = new D2();
        d.write(); */

/*         class SD1 {
                public int i1;
                public double d1;
                public SD1(int i1) {
                        System.out.println("SD1(int i1) 생성자 수행");
                        this.i1 = i1 * i1;
                        System.out.println(i1 + "의 2제곱은 : " + this.i1);
                }
                public SD1 (double d1) {
                        System.out.println("SD1(double d1) 생성자 수행");
                        this.d1 = d1 * d1;
                        System.out.println(d1 + "의 2제곱은 : " + this.d1);
                }
        }

        class Sub1 extends SD1 {
                public Sub1(int i1) {
                        super(i1);
                        System.out.println("Sub1(int i1) 생성자 수행");
                        this.i1 = this.i1 * i1;
                        System.out.println(i1 + "의 3제곱은 : " + this.i1);
                }
                public Sub1(double d1) {
                        super(d1);
                        System.out.println("Sub1(double d1) 생성자 수행");
                        this.d1 = this.d1 * d1;
                        System.out.println(d1 + "의 3제곱은 : " + this.d1);
                }
        }
        Sub1 sub1 = new Sub1(10);
        Sub1 sub2 = new Sub1(10.5); */

/*         class Engine {
                String capacity;
                String fuel;
                private int price = 20000000;
                public Engine(int cc, int fuel) {
                        if (cc == 1) {
                                capacity = "2000cc이하";
                                price += 0;
                        } else {
                                capacity = "2000cc이상";
                                price += 10000000;
                        }
                        if (fuel == 1) {
                                this.fuel = "가솔린";
                                price += 5000000;
                        } else this.fuel = "디젤";
                }
                public int getPrice() {
                        return price;
                }
        }
        class Car {
                String color;
                Engine e;
                public Car(String c, int cc, int fuel) {
                        color = c;
                        e = new Engine(cc, fuel);
                }
                public String getPrice() {
                        return "당신이 요청한 " + e.capacity + "의"  + e.fuel + "차량(컬러: "+ color + ")의 가격은 : " + e.getPrice();
                }
        }
        String color;
        int cc, fuel;
        System.out.println("구입하고 싶은 차의 배기량은 (1: 2000cc 이하, 2: 2000cc 이상): ");
        Scanner stdin = new Scanner(System.in);
        cc = stdin.nextInt();
        System.out.println("구입하고 싶은 차의 연료는 (1: 가솔린, 2: 디젤): ");
        stdin = new Scanner(System.in);
        fuel = stdin.nextInt();
        System.out.println("구입하고 싶은 차의 컬러는 : ");
        stdin = new Scanner(System.in);
        color = stdin.next();
        Car c = new Car(color, cc, fuel);
        System.out.println(c.getPrice());
        System.out.println("차량의 가격은: " + c.e.getPrice()); */

/*         class Rectangle4 {
                public int width;
                public int height;
                public Rectangle4(int w, int h) {
                        this.width = w;
                        this.height = h;
                }
                public int computerRectangleArea() {
                        return width * height;
                }
        }
        class Cube4 extends Rectangle4 {
                public int depth;
                public Cube4(int w, int h, int d) {
                        super(w, h);
                        this.depth = d;
                }
                public int computerCubeArea() {
                        return super.computerRectangleArea() * depth;
                }
        }
        Rectangle4 r = new Cube4(10, 20, 30);
        System.out.println("넓이는 : " + r.computerRectangleArea()); */
        // System.out.println("넓이는 : " + r.computerCubeArea());
        // Cube4 c = new Rectangle4(10, 20);

/*         class Rectangle {
                public int width;
                public int height;
                public Rectangle(int w, int h) {
                        this.width = w;
                        this.height = h;
                }
                public int computerRectangleArea() {
                        return width * height;
                }
        }
        class Cube extends Rectangle {
                public int depth;
                public Cube(int w, int h, int d) {
                        super(w, h);
                        depth = d;
                }
                public int computerCubeAre() {
                        return super.computerRectangleArea() * depth;
                }
        }
        Rectangle r = new Rectangle(10, 20);
        Cube c = new Cube(10, 20, 30);
        System.out.println("r이 Rectangle의 객체? : " + (r instanceof Rectangle)); // true
        System.out.println("r이 Cube의 객체? : " + (r instanceof Cube)); // false
        System.out.println("c가 Cube의 객체 ? : " + (c instanceof Cube)); // true
        System.out.println("==========형 변환 이후==========");
        r = new Cube(20, 30, 40);
        System.out.println("형 변환 r이 Rectangle의 객체? :" + (r instanceof Rectangle)); // true
        System.out.println("형 변환 r이 Cube의 객체? : " + (r instanceof Cube)); // true
        System.out.println("형 변환 c가 Rectangle의 객체? : " + (c instanceof Rectangle)); // true
        System.out.println("형 변환 c가 Cube의 객체? : " + (c instanceof Cube)); // true
        System.out.println("============================");
        System.out.println("c가 Object의 객체? : " + (c instanceof Object)); // ture */

/*         class Am {
                int count = 1;
                void callme() {
                        System.out.println("Am의 callme() 실행, count 값 : " + count);
                }
        }
        class Bm extends Am {
                int count = 2;
                void callme() {
                        System.out.println("Bm의 callme() 실행, count 값 : " + count);
                }
        }
        class Cm extends Am {
                int count = 3;
                void callme() {
                        System.out.println("Cm의 callme() 실행, count 값 : " + count);
                }
        }
        Am r = new Am();
        r.callme();
        System.out.println("r.count 값 : " + r.count);

        r = new Bm();
        r.callme();
        System.out.println("r.count 값 : " + r.count);

        r = new Cm();
        r.callme();
        System.out.println("r.count 값 : " + r.count); */

/*         abstract class Shape {
                abstract void draw();
                abstract void computerArea(double a, double b);
        }
        class Rectangle1 extends Shape {
                void draw() {
                        System.out.println("사각형을 그리는 기능");
                }
                void computerArea(double h, double v) {
                        System.out.println("사각형의 넓이 : " + (h * v));
                }
        }
        class Triangle1 extends Shape {
                void draw() {
                        System.out.println("삼각형을 그리는 기능");
                }
                void computerArea(double a, double h) {
                        System.out.println("삼각형의 넓이 : " + (a * h / 2));
                }
        }
        System.out.println("추상 메서드를 이용한 다형성 ==");
        Shape s = new Rectangle1();
        s.draw();
        s.computerArea(5.0, 10.0);
        s = new Triangle1();
        s.draw();
        s.computerArea(5.0, 10.0); */

/*         abstract class Figure {
                abstract void draw();
        }
        class Triangle2 extends Figure {
                public void draw() {
                        System.out.println("다형성 : 삼각형을 그린다");
                }
        }
        class Rectangle2 extends Figure {
                public void draw() {
                        System.out.println("다형성 : 사각형을 그린다");
                }
        }
        class Oval2 extends Figure {
                public void draw() {
                        System.out.println("다형성 : 타원형을 그린다");
                }
        }
        class Polydraw {
                public void pdraw(Figure f) {
                        f.draw();
                }
                public void pdraw(Triangle2 t) {
                        t.draw();
                }
                public void pdraw(Rectangle2 r) {
                        r.draw();
                }
                public void pdraw(Oval2 o) {
                        o.draw();
                }
        }
        Polydraw p = new Polydraw();
        Figure fg1 = new Triangle2();
        Figure fg2 = new Rectangle2();
        Figure fg3 = new Oval2();
        p.pdraw(fg1);
        p.pdraw(fg2);
        p.pdraw(fg3); */

/*         interface IStack {
                public void push(int item);
                public int pop();
        }
        class FixedStack implements IStack {
                private int[] stack;
                private int tos;
                FixedStack(int size) {
                        stack = new int[size];
                        tos = -1;
                }
                public void push(int item) {
                        if (tos == stack.length - 1)
                                System.out.println("스택이 꽉 찼음");
                        else
                                stack[++tos] = item;
                }
                public int pop() {
                        if (tos < 0) {
                                System.out.println("스택이 비었음");
                                return 0;
                        }  else    
                                return stack[tos--];
                }
        }
        Random r = new Random();
        FixedStack mystack1 = new FixedStack(10);
        for (int i = 0; i < 10; i++) {
                mystack1.push(r.nextInt(10));
        }
        System.out.println("스택 : mystack1");
        for (int i = 0; i < 10; i++) {
                System.out.println(mystack1.pop() + "");
        } */
/*        abstract class Figure1 {
        abstract void draw();
       }
       interface Shape1 {
        public void computerArea(double a, double b);
       }
       class Triangle3 extends Figure1 implements Shape1 {
        void draw() {
                System.out.println("삼각형을 그리는 기능");
        }
        public void computerArea(double a, double h) {
                System.out.println("삼각형의 넓이 : " + (a * h / 2));
        }
       }
       class Rectangle3 extends Figure1 implements Shape1 {
        void draw() {
                System.out.println("사각형을 그리는 기능");
        }
        public void computerArea(double h, double v) {
                System.out.println("사각형의 넓이 : " + (h * v));
        }
       }
       class Oval3 extends Figure1 implements Shape1 {
        void draw() {
                System.out.println("원을 그리는 기능");
        }
        public void computerArea(double r1, double r2) {
                System.out.println("원의 넓이 : " + (3.14 * r1 * r2));
        }
       }
       class Polydraw1 {
        public void pdraw(Figure1 f) {
                f.draw();
        }
        public void pcomputerArea(Shape1 s, double a, double b) {
                s.computerArea(a, b);
        }
       }
       Polydraw1 p = new Polydraw1();
       Figure1 fg1 = new Triangle3();
       Figure1 fg2 = new Rectangle3();
       Figure1 fg3 = new Oval3();
       Shape1 sp1 = new Triangle3();
       Shape1 sp2 = new Rectangle3();
       Shape1 sp3 = new Oval3();
       p.pdraw(fg1);
       p.pcomputerArea(sp1, 4, 4);
       p.pdraw(fg2);
       p.pcomputerArea(sp2, 4, 4);
       p.pdraw(fg3);
       p.pcomputerArea(sp3, 4, 4); */
    }
}

