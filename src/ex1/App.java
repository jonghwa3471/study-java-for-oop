package ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // member 클래스에 정의된 형태로 3명의 회원을 저장할 수 있는 배열 크기를 지정하고, 값 초기화
        member[] members = new member[3];
        members[0] = new member("홍길동", "1111", 21, 2, 3.8f);
        members[1] = new member("김철수", "2222", 22, 3, 2.5f);
        members[2] = new member("고영희", "3333", 23, 4, 4.5f);

        // 검색 및 검색결과 저장 member 객체 인스턴스 선언 및 초기화
        member searchMember = new member();
        member memberInfo;

        // 사용자로부터 학번을 입력받는 부분과 member 클래스에 선언된 인스턴스 함수를 이용 검색 수행
        Scanner scanner = new Scanner(System.in);
        System.out.print("input student's Registed Number : ");
        String reg_num = scanner.next();
        memberInfo = searchMember.getmember(reg_num, members);

        // 검색된 결과를 출력해주는 부분
        System.out.println("검색결과");
        System.out.println("Name : " + memberInfo.getName());
        System.out.println("Registed Number : " + memberInfo.getRegnum());
        System.out.println("Age : " + memberInfo.getAge());
        System.out.println("Grade : " + memberInfo.getGrade());
        System.out.println("Average Point : " + memberInfo.getAvgpoint());
    }
}
