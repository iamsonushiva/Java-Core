package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println("        TAX CALCULATOR APP         ");
        System.out.println("-----------------------------------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE TOTAL PERSON COUNT");
        int count=scanner.nextInt();
        String[] employee = new String[10];
        long[] income = new long[10];
        Scanner s1= new Scanner(System.in);
        for(int i = 0; i<count; i++)
        {
            System.out.println("Enter the Name of Employee - "+ (i+1));
            employee[i]=s1.nextLine();
            System.out.println("Enter "+ employee[i] + "'s Annual Income:");
            income[i]=s1.nextLong();
        }
        scanner.close();
        for(int j=0;j<count;j++)
        {
            calculateTax(employee[j],income[j]);
        }


    }
    public static void calculateTax(String name,long income)
    {
        double tax;
        if(income>=300000)
            tax=(float)income*20/100;
        else if ( income>=100000)
            tax = (float) income * 10 / 100;
        else
            tax=0;
        System.out.println("----------------------------------------");
        System.out.println("NAME OF THE EMPLOYEE : "+name);
        System.out.println("TAX TO BE PAID in Rs :"+tax);
        System.out.println("----------------------------------------");

    }

}
