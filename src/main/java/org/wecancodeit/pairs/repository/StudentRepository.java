package org.wecancodeit.pairs.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.wecancodeit.pairs.student.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentRepository {
	private ArrayList<Student> students = new ArrayList<Student>();
	String pair1 = "";
	String pair2 = "";
	String pair3 = "";
	String pair4 = "";
	String pair5 = "";
	String pair6 = "";
	String pair7 = "";

	public StudentRepository() {
		addStudent(new Student("Riley"));
		addStudent(new Student("Max"));
		addStudent(new Student("Jane"));
		addStudent(new Student("Ingrid"));
		addStudent(new Student("Josh"));
		addStudent(new Student("Kevin"));
		addStudent(new Student("Thomas"));
		addStudent(new Student("Kelli"));
		addStudent(new Student("Alex"));
		addStudent(new Student("Khoi"));
		addStudent(new Student("Justin"));
		addStudent(new Student("Joe"));
		addStudent(new Student("Wayne"));
		addStudent(new Student("Tre"));
		shuffle();
		pair();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public Student findOne(String studentName) {
		for (Student currentStudent : students) {
			if (currentStudent.getName().equals(studentName)) {
				return currentStudent;
			}
		}
		return null;
	}

	public void shuffle() {
		Collections.shuffle(students);
	}

	public void pair() {
		pair1 = students.get(0).getName() + " + " + students.get(1).getName();
		pair2 = students.get(2).getName() + " + " + students.get(3).getName();
		pair3 = students.get(4).getName() + " + " + students.get(5).getName();
		pair4 = students.get(6).getName() + " + " + students.get(7).getName();
		pair5 = students.get(8).getName() + " + " + students.get(9).getName();
		pair6 = students.get(10).getName() + " + " + students.get(11).getName();
		pair7 = students.get(12).getName() + " + " + students.get(13).getName();
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public String getPair1() {
		return pair1;
	}

	public String getPair2() {
		return pair2;
	}

	public String getPair3() {
		return pair3;
	}

	public String getPair4() {
		return pair4;
	}

	public String getPair5() {
		return pair5;
	}

	public String getPair6() {
		return pair6;
	}

	public String getPair7() {
		return pair7;
	}

	@Override
	public String toString() {
		String studentNames = "";
		for (Student currentStudent : students) {
			studentNames = studentNames + " " + currentStudent.getName();
		}
		return studentNames;
	}

}
