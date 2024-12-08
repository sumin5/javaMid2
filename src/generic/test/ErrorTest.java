package generic.test;

import java.util.Scanner;

public class ErrorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0; //총 점수 저장한다 성적과 학점의 곱의 합
        double count = 0; //학점의 총합
        for (int i = 0; i < 20; i++) { //20번 입력
            double val = sc.nextDouble(); //학점
            String grade = sc.next(); //성적
            count += val; //학점의 총합 누적
            switch (grade) {
                case "A+":
                    sum += val * 4.5;
                    break;
                case "A0":
                    sum += val * 4.0;
                    break;
                case "B+":
                    sum += val * 3.5;
                    break;
                case "B0":
                    sum += val * 3.0;
                    break;
                case "C+":
                    sum += val * 2.5;
                    break;
                case "C0":
                    sum += val * 2.0;
                    break;
                case "D+":
                    sum += val * 1.5;
                    break;
                case "D0":
                    sum += val * 1.0;
                    break;
                case "F":
                    sum += val * 0;
                    break;
                case "P":
                    count -= val;
                    break;
            }
        }
        System.out.println(sum / count); //평균 학점 계산
    }

}
