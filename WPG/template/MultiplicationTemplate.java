package template;

import main.RandomGenerator;
import student.Information;

public class MultiplicationTemplate implements Template{
    private int num1;
    private int num2;
    private double answer;
    private String name1;
    private String item;

    public void getTemplate(){
        System.out.println(name1+"은 "+num1+"개의 "+item+"을 "+num2+"묶음 가지고 있습니다.\n"
                + "그들이 가지고 있는 "+ item+"이 모두 몇 개입니까?");
    }
    public void setTemplate(){
        this.name1 = Information.getName(RandomGenerator.getRandomName());
        this.item = Information.getItem(RandomGenerator.getRandomItem());
        this.num1 = RandomGenerator.getRandomRange();
        this.num2 = RandomGenerator.getRandomRange();
    }
    public double getAnswer(){
        return answer;
    }
    public void setAnswer(){
        this.answer = num1 * num2;
    }
}
