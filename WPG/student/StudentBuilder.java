package student;

import java.util.ArrayList;

import main.Scanners;


public class StudentBuilder implements Builder {
    ArrayList<String> name;
	ArrayList<String> item;
	int min;
	int max;


	public StudentBuilder() {
		name=new ArrayList<String>();
		item=new ArrayList<String>();
	}
	public Information build() {
		return new Information(this);
	}

	public StudentBuilder setName() {
		System.out.print("\n아이들에게 중요한 사람들의 이름을 ");
		this.name = Scanners.getStrings();
		return this;
	}

	public StudentBuilder setItem() {
		System.out.print("\n아이들이 관심을 가지고 있는 항목의 이름을 ");
		this.item = Scanners.getStrings();
		return this;
	}

	public StudentBuilder setMin() {
        System.out.print("\n숫자 범위의 최솟값 : ");
		this.min = (int)Scanners.getIntegerOne();
		return this;
	}

	public StudentBuilder setMax() {
        System.out.print("\n숫자 범위의 최댓값 : ");
		this.max = (int)Scanners.getIntegerOne();
		return this;
	}
}
