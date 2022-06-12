package template;
import main.RandomGenerator;
import student.Information;

public class SubtractionTemplate implements Template{
    private int num1;
    private int num2;
    private double answer;
    private String name1;
    private String name2;
    private String item;

    public void getTemplate(){
        System.out.println(name1+"은 "+item +"을 "+num1+"개 가지고 있습니다.\n"
        +name1+"은 "+name2+"에게 "+item+" "+num2+"개 주었습니다."
        +name1+ "에게 몇 개의 "+ item+"가 남았습니까?");
    }
    public void setTemplate(){
        this.name1 = Information.getName(RandomGenerator.getRandomName());
        this.name2 = Information.getName(RandomGenerator.getRandomName());
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
        this.answer = num1 - num2;
    }
}
