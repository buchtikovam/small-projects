final public class Mentor extends Person {
	public String level = "intermediate";

	public Mentor() {
		super();
	}

	public Mentor(
		String name,
		int age,
		String gender,
		String level
	) {
		super(name, age, gender);
		this.level = level;
	}

	@Override
	public void getGoal() {
		System.out.println(
			"Educate brilliant junior software developers."
		);
	}

	@Override
	public void introduce() {
		System.out.println(
			"Hi, I'm "
			+ this.name
			+ " a "
			+ this.age
			+ " year old "
			+ this.gender
			+ " "
			+ this.level
			+ " mentor."
		);
	}
}
