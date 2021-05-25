package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cakeName = new ArrayList<>();
        cake c1 = new cake();
        cakeName.add("Chocolate Brownie");
        cakeName.add("Chocolate Maple");
        c1.setName(cakeName);

        List<Float> cakePrice = new ArrayList();
        cakePrice.add(250.0f);
        cakePrice.add(300.0f);
        c1.setPrice(cakePrice);

        List<String> pastryName = new ArrayList();
        pastry c2 = new pastry();
        pastryName.add("Black Forest");
        pastryName.add("Choco Truffle");
        c2.setName(pastryName);

        List<Float> pastryPrice = new ArrayList();
        pastryPrice.add(35.0f);
        pastryPrice.add(40.0f);
        c2.setPrice(pastryPrice);

        System.out.println("           Today's Special Menu       ");
        System.out.println("--------------------------------------");
        System.out.println("Special Cakes                         ");
        System.out.println("--------------------------------------");


        for (int i=0;i<1;i++)
        {
            c2.display(cakeName, cakePrice);
        }
    }
        System.out.println("Special Pastry");
        System.out.println("--------------------------------------");

        for(int i=0;i<1;i++)
        {
            c2.display( pastryName, pastryPrice);
        }
}


