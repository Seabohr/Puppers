package restPuppers.data;

public class Pupper {

	private String name;
	private int age;

	public Pupper(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Pupper() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pupper [name=" + name + ", age=" + age + "]";
	}

}
