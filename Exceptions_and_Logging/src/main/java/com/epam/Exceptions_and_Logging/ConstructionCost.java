package com.epam.Exceptions_and_Logging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class construction_cost 
{

    public double construction(double area,int i)
    {
        double cost;
        double array[]= {area*1200, area*1500, area*1800, area*2500};
        cost=array[i];
        if(cost <= 9999) cost = 0;
        return cost;
    }
}
class server
{
    private static final Logger LOGGER=LogManager.getLogger();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        construction_cost cs=new construction_cost();
        LOGGER.info("Enter 1:Standard Material 2:Above Standard Material 3:High Standard Material 4:High Standard Material and Fully Ay=utomated");
        int i = sc.nextInt();
        double area = 20;
        double cost;
        cost = cs.construction(area,i);
        LOGGER.info(cost);
    }
}
