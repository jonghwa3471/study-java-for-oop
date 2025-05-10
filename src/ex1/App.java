package ex1;
import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        System.out.println("읽어 들일 파일명을 입력하세요 : ");
        String s = stdin.next();
        FileReader fr = new FileReader(s);
        int i;
        while((i = fr.read()) != -1) {
            System.out.println((char)i);
        }
        fr.close();
    }
}
