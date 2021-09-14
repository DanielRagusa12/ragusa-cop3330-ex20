package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class App
{
    public static void main(String[] args)
    {
        double order_amount;
        String state;
        String county;
        double total;
        double tax;
        String final_answer;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        order_amount = input.nextDouble();

        System.out.print("What state do you live in? ");
        state = input.next();

        total=order_amount;
        BigDecimal rounding = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        total = rounding.doubleValue();
        String.format("%.2f", total);
        final_answer="The total is $"+(total);


        if(state.equals("Wisconsin"))
        {
            tax=order_amount*.05;
            total=order_amount+(tax);
            System.out.print("What county do you live in? ");
            county = input.next();

            if(county.equals("Eau Claire"))
            {
                total=total+0.005;
                tax=tax+0.005;
            }
            if(county.equals("Dunn"))
            {
                total=total+0.004;
                tax=tax+0.004;
            }
            BigDecimal rounding2 = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            total = rounding2.doubleValue();
            String.format("%.2f", tax);
            String.format("%.2f", total);
            final_answer="The tax is $"+(tax)+"."+"\n"+"The total is $"+(total)+".";
        }

        if(state.equals("Illinois"))
        {
            tax=order_amount*.08;
            total=order_amount+(tax);
            BigDecimal rounding3 = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
            total = rounding3.doubleValue();
            String.format("%.2f", tax);
            String.format("%.2f", total);
            final_answer="The tax is $"+(tax)+"."+"\n"+"The total is $"+(total)+".";
        }


        System.out.print(final_answer);


    }

}