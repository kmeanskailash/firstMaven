package com.maven.project.Student;

import java.util.Collections;

import com.sun.tools.javac.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Student> stu=List.of(
    							new Student(67,"Komal"),
    							new Student(98,"Suresh"),
    							new Student(55,"Sagar"),
    							new Student(78,"JaiRam")
    							
    							);
    	
    	for(Student s:stu)
    	{
    		System.out.println(s.getName());
    	}
        
    }
}
