/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments_package;

/**
 *
 * @author Radwa
 */

import java.util.Scanner;
abstract class person
{
    protected String name;
    protected int age;
    
    person(String name,int age)
    {
     this.name=name;
     this.age=age;   
    }
    public abstract void print();
}
class teacher extends person
{
    private int noOfcourses;
    String[] courses_names; ;//private
    private double salary;
   
    teacher(String name,int age,int noOfcourses )
    {
        super(name,age);
        courses_names=new String[noOfcourses];
        this.noOfcourses=noOfcourses;
    }
    teacher(String name,int age,int noOfcourses,double salary )
    {
       this(name,age, noOfcourses);
        this.salary=salary;
    }
     public void setCourses_names(String[] courses_names)
     {
            this.courses_names= courses_names;
    }
    public void print()
    {
        System.out.println("Name: "+name+"\n"+"Age: "+age+"\n"+"Number of Courses: "+noOfcourses+"\n"+"Salary: "+salary);
        for(int i=0;i<noOfcourses;i++)
        {
       System.out.println("course"+(i+1)+": "+courses_names[i]);
        }
    }

   
    
}
public class Assignments_package {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int age,noOfcourses;
        double salary;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        name=input.next();
        
        System.out.println("Enter Age: ");
        age=input.nextInt();
        
        System.out.println("Enter Number Of Courses: ");
        noOfcourses=input.nextInt();
        
        System.out.println("Enter Salary: ");
        salary=input.nextLong();
        
        teacher t=new teacher(name,age,noOfcourses,salary);

        for(int i=0;i<noOfcourses;i++)
            {
                System.out.println("course "+(i+1)+ ": ");  
                t.courses_names[i]=input.next();
            }
        
        t.print();
    }
    
}
