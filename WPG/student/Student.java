package student;

import main.Scanners;

public class Student {
    private String name;
	private int score;
	public Information info;
	
	public Student(){

	}
	public void setName() {
		String tmp = Scanners.getString();
		this.name = tmp;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
    public String getName() {
		return name;
	}
}
