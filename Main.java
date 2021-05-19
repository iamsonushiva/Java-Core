package com.internshala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String name;
	String bloodGroup ;
	String group = new String();
	int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE NAME ");
        name=scanner.nextLine();
        System.out.println("ENTER THE AGE");
        age=scanner.nextInt();
        System.out.println("ENTER THE BLOOD GROUP");
        bloodGroup = scanner.next();
        if(age>=20)
            group="RED";
        else if(age>=15 && age<20)
            group="BLUE";
        else if(age>=10 && age<15)
            group="YELLOW";
        else System.out.println("GROUP UNAVAILABLE");
        System.out.println("--------------------------------------");
        System.out.println("            STUDENT DETAILS     ");
        System.out.println("--------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("--------------------------------------");
        System.out.println("Your Group is " + group);
        System.out.println("--------------------------------------")
        ;

    }
}
