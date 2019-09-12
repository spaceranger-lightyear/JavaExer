/*
 Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 
 Input. 입력은 여러 개의 테스트 케이스로 이루어져 있다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 Output. 각 테스트 케이스마다 A+B를 출력한다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        while( kb.hasNextInt()) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            System.out.println(a+b);
        }
    }
}
