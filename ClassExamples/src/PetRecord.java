
public class PetRecord {
	
	private String name = new String("");
	private int age = 0;
	public static int numCreated = 0;
	public PetRecord(String initName, int initAge) {
		name = initName;
		if(initAge < 0) {
			System.out.println("Error");
		} else {
			age = initAge;
		}

		++numCreated;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + " is " + age + " years old.";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PetRecord pr = new PetRecord("Spot", 5);
		System.out.println(pr);

	}

}
