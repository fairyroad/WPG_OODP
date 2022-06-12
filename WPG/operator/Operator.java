package operator;

import java.util.ArrayList;

import main.Scanners;
import template.AdditionTemplate;
import template.DivisionTemplate;
import template.MultiplicationTemplate;
import template.SubtractionTemplate;
import template.Template;

public class Operator{
    boolean[] op = new boolean[4];
    int num;
    int opNum = 0;

    public void setOperator(){
        ArrayList<String> str = Scanners.getStrings();
        for(int i = 0; i < str.size(); i++)
        {
            if(str.get(opNum).equals("+"))
            {
                op[0] = true;
            }
            else if(str.get(opNum).equals("-"))
            {
                op[1] = true;
            }
            else if(str.get(opNum).equals("*"))
            {
                op[2] = true;
            }
            else if(str.get(opNum).equals("/"))
            {
                op[3] = true;
            }
            opNum += 1;
        }

    }

    public void setNumber(){
        this.num = (int)Scanners.getIntegerOne();

    }

    public int getNumber()
    {
        return num;
    }
    
    public int getOpNum(){
        return opNum;
    }

    public boolean getOp(int idx){
        if(op[idx] == true)
        {
            return true;
        }
        return false;
    }

    public Template getTemplate(int idx){
        if(idx == 0)
        {
            return new AdditionTemplate();
        }
        else if(idx == 1)
        {
            return new SubtractionTemplate();
        }
        else if(idx == 2)
        {
            return new MultiplicationTemplate();
        }
        else{
            return new DivisionTemplate();
        }
        
    }
}
