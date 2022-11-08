package com.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionsAssign {
	public static List<Transaction4> sortTransactions(List <Transaction4> transactions) {
	List<Transaction4> sortedTrans= new ArrayList<>();
	sortedTrans=transactions.stream()
	.filter(p->p.getYear()==2011)
	.sorted(Comparator.comparingInt(Transaction4::getValue))
	.collect(Collectors.toCollection(ArrayList::new));
	System.out.println(sortedTrans);
	return sortedTrans;
	}

	public static List<Integer> transaction3sValuesDelhi(List<Transaction4> transactions) {
	List<Integer> transactioValueDelhi = new ArrayList<>();
	transactions.stream()
	.filter(p->p.getTrader().getClass().equals("Delhi"))
	.forEach(p->transactioValueDelhi.add(p.getValue()));
	System.out.println(transactioValueDelhi);
	return transactioValueDelhi;
	}
	public static int highestTransaction2(List<Transaction4> transactions){
	int mx=Integer.MIN_VALUE;
	List<Integer>list = new ArrayList<>();
	transactions.stream()
	.forEach(p->list.add(p.getValue()));
	mx =Collections.max(list);
	//System.out.println(mx);
	return mx;
	}

	public static int smallestTransaction1(List<Transaction4> transactions){
	int mn=Integer.MAX_VALUE;
	List<Integer>list = new ArrayList<>();
	transactions.stream()
	.forEach(p->list.add(p.getValue()));
	mn =Collections.min(list);
	return mn;

	}

	public static void main(String[] args) {
	Trader t1 = new Trader("name1", "Bangalore");
	Trader t2 = new Trader("name2", "Pune");
	Trader t3 = new Trader("name3", "Bangalore");
	Trader t4 = new Trader("name4", "Delhi");
	Trader t5= new Trader("name5", "Chennai");

	Trader t6 = new Trader("name6", "Pune");
	Trader t7 = new Trader("name7", "Delhi");
	Trader t8 = new Trader("name8", "Delhi");
	Trader t9 = new Trader("name9", "Pune");

	Transaction4 ts1 = new Transaction4(t1,2011,300);
	Transaction4 ts2 = new Transaction4(t2,2011,200);
	Transaction4 ts3 = new Transaction4(t3,2012,100);
	Transaction4 ts4 = new Transaction4(t4,2011,400);
	Transaction4 ts5 = new Transaction4(t5,2011,400);
	Transaction4 ts6 = new Transaction4(t6,2010,300);
	Transaction4 ts7 = new Transaction4(t7,2013,200);
	Transaction4 ts8 = new Transaction4(t8,2012,150);
	Transaction4 ts9 = new Transaction4(t9,2009,400);

	ArrayList<Transaction4> transactions = new ArrayList<>();
	transactions.add(ts1);
	transactions.add(ts2);
	transactions.add(ts3);
	transactions.add(ts4);
	transactions.add(ts5);
	transactions.add(ts6);
	transactions.add(ts7);
	transactions.add(ts8);
	transactions.add(ts9);
	sortTransactions(transactions);
	transaction3sValuesDelhi(transactions);
	System.out.println(highestTransaction2(transactions));
	System.out.println(smallestTransaction1(transactions));


	}
	}




