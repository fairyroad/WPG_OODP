//2019111980 길유정
package main;

import operator.Operator;
import student.Builder;
import student.Student;
import student.StudentBuilder;
import template.Template;

public class WPGgenerator {
    private int totalScore = 0;
    private Student student;
    private Operator operator;
    private Template temp;

    //학생 정보 입력받기
    public void setStudent(){

        student = new Student();
        System.out.println("학생의 이름을 입력해주세요 :)");
        student.setName();

        Builder builder = new StudentBuilder();
        builder.setName();
        builder.setItem();
        builder.setMin();
        builder.setMax();
        student.info = builder.build();
    }

    public void createProblem(){
        operator = new Operator();

        System.out.print("풀고싶은 연산의 종류를 ");
        operator.setOperator();
        System.out.print("풀고 싶은 문제의 총 개수 : ");
        operator.setNumber();
        System.out.println("\n>>>>>>>>>>>>>>>>문제를 만드는 중입니다<<<<<<<<<<<<<<<<");
    }

    public void solveProblem(){
        System.out.println("Start!!!!!!\n");
        int i = 0;
        int j= 0;
        double answer;
        int div = operator.getNumber() / operator.getOpNum();
        while(i < operator.getOpNum())
        {
            while(operator.getOp(j) != true)
            {
                j += 1;
            }
            for(int k = 0; k < div; k++)
            {
                temp = operator.getTemplate(j);
                temp.setTemplate();
                temp.getTemplate();
                temp.setAnswer();
                System.out.print("답:");
                answer = Scanners.getIntegerOne();
                if(answer == temp.getAnswer())
                {
                    System.out.println("정답입니당~~!!\n");
                    setScore(1);
                }
                else{
                    System.out.println("틀렸습니다ㅠㅠㅠ\n");
                }
            }
            i += 1;
            j += 1;
        }
        System.out.println(">>>>>>>>문제 생성을 종료합니다<<<<<<<");
    }

    public void setScore(int num){
        totalScore += num;
    }

    public void getScore(){
        System.out.println("총 점수는 "+totalScore+" 입니다:)\n");
    }

}
