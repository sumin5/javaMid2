package generic.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        while( (str = br.readLine()) != null && !str.isEmpty()) {
            sb.append(str).append(System.lineSeparator());
        }

        Map<String,Double> BaseScore = Map.of(
                "A+",4.5,
                "A0",4.0,
                "B+",3.5,
                "B0",3.0,
                "C+",2.5,
                "C0",2.0,
                "D+",1.5,
                "D0",1.0,
                "F",0.0
        );
        double userAllSubjectScore = 0.0;
        str  = sb.toString();
        String[] split = str.split(System.lineSeparator());

        double divideScore = 0; // 나눌 학점수 (최종 계산에 나눌 학점)

        for(int i=0; i<split.length; i++) {

            String[] split2 = split[i].split(" ");

            if(BaseScore.containsKey(split2[2])) {
                double userSubjectScore = Double.parseDouble(split2[1]); // 과목 학점
                double subjectScore = BaseScore.get(split2[2]);   // 학점 과목
                divideScore += userSubjectScore;
                userAllSubjectScore += userSubjectScore * subjectScore;  // 유저 총 학점수
            }
        }

        System.out.printf("%.6f\n", userAllSubjectScore/divideScore);

    }
}
