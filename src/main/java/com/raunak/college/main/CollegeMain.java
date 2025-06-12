package com.raunak.college.main;

import com.raunak.college.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CollegeMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("collegePU");
        EntityManager em = emf.createEntityManager();

        Student student = new Student(1, "Raunak Sharma", "Computer Science");
        Student student2 = new Student(2, "Chhabinah Sahoo", "CSE");
        Student student3 = new Student(3, "HImanshu Raghuvanshi", "Civil Eng");
        Student student4 = new Student(4, "Satu Ashish", "Mechanical Eng");
        Student student5 = new Student(5, "Amrit Keshri", "Elctronics Eng");
        Student student6 = new Student(6, "Priya Kumari", "MBA");
        Student student7 = new Student(7, "Sagar", "Cyber Security");

        em.getTransaction().begin();
        em.persist(student);
        em.persist(student2);
        em.persist(student3);
        em.persist(student4);
        em.persist(student5);
        em.persist(student6);
        em.persist(student7);
        em.getTransaction().commit();
        System.out.println("Student saved successfully!");

        em.close();
        emf.close();

	}

}
