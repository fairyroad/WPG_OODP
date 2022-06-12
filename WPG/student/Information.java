package student;

import java.util.ArrayList;


public class Information {
    private static ArrayList<String> name;
	private static ArrayList<String> item;
	private static int min;
	private static int max;
	
	Information(StudentBuilder builder) {
		Information.name = builder.name;
		Information.item= builder.item;
		Information.min = builder.min;
		Information.max = builder.max;
	}
	public static String getName(int idx) {
		return name.get(idx);
	}
	public static String getItem(int idx) {
		return item.get(idx);
	}
	public static int getNameSize() {
		return name.size();
	}

	public static int getItemSize() {
		return item.size();
	}
	public static int getMin() {
		return min;
	}
	public static int getMax() {
		return max;
	}

}
