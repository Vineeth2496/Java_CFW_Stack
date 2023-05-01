package com.CFWStack;

import java.util.Stack;

public class Stacklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		System.out.println("Before Stack:");
		st.add("Chicken Biryani");
		st.add("Mutton Biryani");
		st.add("Fish Biryani");
		st.add("Prawan Biryani");
		st.add("Veg Biryani");
		System.out.println("After Item has Added: "+st);
		//  public E push(E);
		//  public synchronized E pop();
		//  public synchronized E peek();
		//  public boolean empty();
		st.push("Grilled Chicken");
		st.push("Tandoori Chicken");
		st.push("Chicken 65");
		System.out.println("After push: "+st);
		st.pop();
		System.out.println("After pop: "+st);
		System.out.println("Peek item is: "+st.peek());
		st.empty();
		System.out.println("Stack of items are empty: "+st.empty());
	}

}
/*

C:\Users\vinee>javap java.util.Stack
Compiled from "Stack.java"
public class java.util.Stack<E> extends java.util.Vector<E> {
  public java.util.Stack();
  public E push(E);
  public synchronized E pop();
  public synchronized E peek();
  public boolean empty();
  public synchronized int search(java.lang.Object);
}

C:\Users\vinee>
*/