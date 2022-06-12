package main;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Scanners {
    private static Scanner in = new Scanner(new InputStreamReader(System.in));
    
    public static ArrayList<String> getStrings(){
        in.nextLine();
        System.out.println("띄어쓰기로 구분해서 문자열을 입력해주시고 마지막에는 done을 붙여주세요 :)");
        ArrayList<String> tmp = new ArrayList<String>();

        while(true)
        {
            String str = in.next();
            if(str.equals("done"))
            {
                break;
            }
            tmp.add(str);
        }
        return tmp;
    }

    public static String getString(){
        String str = in.next();
        return str;
    }

    public static double getIntegerOne(){
        double tmp = in.nextDouble();
        return tmp;
    }
}
