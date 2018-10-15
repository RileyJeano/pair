package org.wecancodeit.pairs.repository;

import org.junit.Assert;
import org.junit.Test;
import org.wecancodeit.pairs.student.Student;

public class StudentRepositoryTest {

	@Test
	public void shouldAddAstudentToRepository() {
		StudentRepository underTest = new StudentRepository();
		Student riley = new Student("Riley");
		underTest.addStudent(riley);
		Student foundStudent = underTest.findOne("Riley");
		Assert.assertEquals("Riley", foundStudent.getName());

	}

	@Test
	public void shouldShuffle() {
		StudentRepository underTest = new StudentRepository();
		Student riley = new Student("Riley");
		underTest.addStudent(riley);
		Student max = new Student("Max");
		underTest.addStudent(max);
		Student jane = new Student("Jane");
		underTest.addStudent(jane);
		Student josh = new Student("Josh");
		underTest.addStudent(josh);
		underTest.shuffle();
		System.out.println(underTest);
	}

	@Test
	public void shouldPair() {
		StudentRepository underTest = new StudentRepository();
		underTest.pair();
		Assert.assertEquals(underTest.pair1, "Riley + Max");
		Assert.assertEquals(underTest.pair2, "Jane + Ingrid");
	}

}
