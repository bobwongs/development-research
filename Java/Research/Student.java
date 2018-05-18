
public class Student extends Person implements Exercise {
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void examine() {
		this.goToSchool();
		System.out.println(this.name + ": examining");
		
		this.doMorningExercise();
	}
	
	private void goToSchool() {
		System.out.println("go to school");
	}
	
	public void doMorningExercise() {
		System.out.println("student doMorningExercise");
	}
}
