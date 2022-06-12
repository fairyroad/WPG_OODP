//2019111980 길유정
package main;

public class Client{
    public static void main(String[] args) {
        WPGgenerator wpg = new WPGgenerator();
        wpg.setStudent();
        wpg.createProblem();
        wpg.solveProblem();
        wpg.getScore();
    }
}