package com.kodilla.kodilla;
import java.util.*;
import java.lang.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaApplication.class, args);

		ArrayList<Integer> grade = new ArrayList<Integer>();

		grade.add(1);
		grade.add(2);
		grade.add(3);
		grade.add(4);
		grade.add(5);
		grade.add(6);
		grade.add(1);
		grade.add(2);
		grade.add(3);
		grade.add(4);
		grade.add(5);
		grade.add(3);
		grade.add(4);
		grade.add(5);
		grade.add(6);
		grade.add(3);
		grade.add(3);

		Integer grades[] = new Integer[grade.size()];
		grades = grade.toArray(grades);
		int sum = 0;
		int min = 10;
		int max = 0;
		for (Integer number : grades) {
			sum = number + sum;
			if (number < min)
			{
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}
		double average = ((sum - min - max) / (grade.size()-2));
		System.out.println("Average = " + average);

		//	Część 2


		//Creating list of Books
		List<Book> list=new LinkedList<Book>();
		//Creating Books
		Book b1=new Book(101,"Let us C",1998);
		Book b2=new Book(102,"Data Communications & Networking",1854);
		Book b3=new Book(103,"Operating System",2006);
		Book b4=new Book(104,"A Brief History Of Time",2008);
		Book b5=new Book(105,"Our Mutual Friend",2004);
		Book b6=new Book(106,"Resurrection",2006);
		Book b7=new Book(107,"All Quiet on the Western Front",2008);
		Book b8=new Book(108,"Earthsea",2004);
		Book b9=new Book(109,"Frankenstein",2006);
		Book b10=new Book(110,"The Magic Toyshop",2008);
		Book b11=new Book(111,"Alice's Adventures in Wonderland",2004);
		Book b12=new Book(112,"The Secret History",2006);

		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		list.add(b9);
		list.add(b10);
		list.add(b11);
		list.add(b12);


		for(Book b:list){

			if (b.year <2000) {
				System.out.println(b.title+" "+b.year);
			}
		}

	}
}
