package template;

import main.RandomGenerator;
import student.Information;

public class DivisionTemplate implements Template {
    private int num1;
    private int num2;
    private double answer;
    private String name1;
    private String item;

    public void getTemplate(){
        System.out.println(name1+"은 "+item +"을 "+num1+"개 가지고 있습니다. "
        + name1+"은 "+num2+"명의 친구에게 "+item+"을 똑같이 나누어 주고 싶습니다. "
                +"각각 " +item+ "을 몇 개씩 가지게 되나요?(나누어지지 떨어지지 않는다면 소수점 이하는 버려주세요");
    }
    public void setTemplate(){
        this.name1 = Information.getName(RandomGenerator.getRandomName());
        this.item = Information.getItem(RandomGenerator.getRandomItem());
        this.num1 = RandomGenerator.getRandomRange();
        this.num2 = RandomGenerator.getRandomRange();
        if(num1 < num2)
        {
            int tmp = num1;
            num2 = num1;
            num1 = tmp;
        }

    }
    public double getAnswer(){
        return answer;
    }
    public void setAnswer(){
        this.answer = num1 / num2;
    }
}
