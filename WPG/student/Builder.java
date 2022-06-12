package student;

public interface Builder {

	public Information build();

	public StudentBuilder setName();

	public StudentBuilder setItem();

	public StudentBuilder setMin();

	public StudentBuilder setMax();
}
