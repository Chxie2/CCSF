package hw.Inheritance;

public class Undergraduate extends Student {
	private int level;

	public Undergraduate() {
		super();
		level = 1;
	}

	public Undergraduate(String initialName, int initialStudentNumber, int initialLevel) {
		super(initialName, initialStudentNumber);
		setLevel(initialLevel);
	}

	public void reset(String newName, int newStudentNumber, int newLevel) {
		setName(newName);
		setStudentNumber(newStudentNumber);
		level = newLevel;
	}

	public void setLevel(int newLevel) {
		if ((1 <= newLevel) && (newLevel <= 4))
			level = newLevel;
		else {
			System.out.println("Not a Valid Level");
			System.exit(0);
		}
	}

	public void writeOutput() {
		String retName = getName();
		int retStuNum = getStudentNumber();
		System.out.println("Name: " + retName);
		System.out.println("Student Number: " + retStuNum);
		System.out.println("Student Level: " + level);
	}

	public boolean equals(Undergraduate otherUndergraduate) {
		return equals((Student) otherUndergraduate) && (this.level == otherUndergraduate.level);
	}

	public int getLevel() {
		return level;
	}
}
