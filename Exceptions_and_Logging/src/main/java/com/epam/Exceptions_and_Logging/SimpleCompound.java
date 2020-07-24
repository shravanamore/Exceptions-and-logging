package com.epam.Exceptions_and_Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleCompound
{	
		public double compound_interest(double amount, double time, double rate)
		{
			double com;
			com = amount * Math.pow(1.0+rate/100.0,time) - amount;
			return com;
		}
		public double simple_interest(double amount, double time, double rate)
		{
			double sim;
			sim = (amount * time * rate)/100;
			return sim;
		}
	}
	class client
	{
		private static final Logger LOGGER = LogManager.getLogger();
		public static void main(String args[]) 
		{
			SimpleCompound sc = new SimpleCompound();
			double amount = 1000;
			double time = 2;
			double rate = 1.5;
			double com, sim;
			com = sc.compound_interest(amount,time,rate);
			sim = sc.simple_interest(amount,time,rate);
			LOGGER.error(sim);
			LOGGER.error(com);
		}
	}

