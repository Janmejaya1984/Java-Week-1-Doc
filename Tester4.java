import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
class Student {
	private int studentId;
	private String studentName;
	private boolean courseRegistered;

	public Student(int studentId, String studentName, boolean courseRegistered) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseRegistered = courseRegistered;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean isCourseRegistered() {
		return courseRegistered;
	}

	public void setCourseRegistered(boolean courseRegistered) {
		this.courseRegistered = courseRegistered;
	}

}

class Tester {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1001, "Steve", true));
		students.add(new Student(1002, "Rachel", false));
		students.add(new Student(1003, "Monica", true));
		students.add(new Student(1004, "David", true));

		ListIterator<Student> itr = students.listIterator();
		
		System.out.println("Display the student names");
		while (itr.hasNext()) {
			System.out.println(itr.next().getStudentName());
		}

		System.out.println("Display the student names in reverse order");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous().getStudentName());
		}

	}
}
